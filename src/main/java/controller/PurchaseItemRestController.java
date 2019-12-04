package controller;

import entity.PurchaseItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import repository.PurchaseItemRepository;

import java.util.List;

@Controller
@RequestMapping(value = "/items", produces = {MediaType.APPLICATION_JSON_VALUE})
public class PurchaseItemRestController {

    @Autowired
    private PurchaseItemRepository repository;

    @GetMapping("/")
    public List<PurchaseItem> getAllPurchaseItems() {
        return repository.findAll();
    }

    @PostMapping("/")
    public PurchaseItem createPurchaseItem(@RequestBody PurchaseItem purchaseItem) {
        return repository.save(purchaseItem);
    }

    @GetMapping("/{id}")
    public PurchaseItem getPurchaseItem(@PathVariable Long id) {
        return repository.findById(id).get();
    }

    @PutMapping("/{id}")
    public PurchaseItem updatePurchaseItem(@RequestBody PurchaseItem purchaseItem, @PathVariable Long id) {
        purchaseItem.setId(id);
        return repository.save(purchaseItem);
    }

    @DeleteMapping("/{id}")
    public void deletePurchaseItem(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
