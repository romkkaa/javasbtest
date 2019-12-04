package controller;

import entity.PurchaseDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import repository.PurchaseDetailsRepository;

import java.util.List;

@Controller
@RequestMapping(value = "/details", produces = MediaType.APPLICATION_JSON_VALUE)
public class PurchaseDetailsRestController {

    @Autowired
    private PurchaseDetailsRepository repository;

    @GetMapping("/")
    public List<PurchaseDetails> getAllPurchaseDetails() {
        return repository.findAll();
    }

    @PostMapping("/")
    public PurchaseDetails createPurchaseDetails(@RequestBody PurchaseDetails purchaseDetails) {
        return repository.save(purchaseDetails);
    }

    @GetMapping("/{id}")
    public PurchaseDetails getPurchaseDetails(@PathVariable Long id) {
        return repository.findById(id).get();
    }

    @PutMapping("/{id}")
    public PurchaseDetails updatePurchaseDetails(@RequestBody PurchaseDetails purchaseDetails, @PathVariable Long id) {
        purchaseDetails.setId(id);
        return repository.save(purchaseDetails);
    }

    @DeleteMapping("/{id}")
    public void deletePurchaseDetails(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
