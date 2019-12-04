package controller;

import entity.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import repository.ItemRepository;

import java.util.List;

@Controller
@RequestMapping(value = "/items", produces = MediaType.APPLICATION_JSON_VALUE)
public class ItemRestController {

    @Autowired
    private ItemRepository repository;

    @GetMapping("/")
    public List<Item> getAllPurchaseItems() {
        return repository.findAll();
    }

    @PostMapping("/")
    public Item createPurchaseItem(@RequestBody Item item) {
        return repository.save(item);
    }

    @GetMapping("/{id}")
    public Item getPurchaseItem(@PathVariable Long id) {
        return repository.findById(id).get();
    }

    @PutMapping("/{id}")
    public Item updatePurchaseItem(@RequestBody Item item, @PathVariable Long id) {
        item.setId(id);
        return repository.save(item);
    }

    @DeleteMapping("/{id}")
    public void deletePurchaseItem(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
