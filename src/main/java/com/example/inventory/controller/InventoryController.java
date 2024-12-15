package com.example.inventory.controller;

import com.example.inventory.entity.Inventory;
import com.example.inventory.service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/inventory")
public class InventoryController {

    @Autowired
    private InventoryService inventoryService;

    @PutMapping("/{inventoryId}/add")
    @ResponseStatus(HttpStatus.OK)
    public Inventory addStock(@PathVariable Long inventoryId, @RequestParam int quantity) {
        return inventoryService.updateStock(inventoryId, quantity);
    }

    @PutMapping("/{inventoryId}/deduct")
    @ResponseStatus(HttpStatus.OK)
    public Inventory deductStock(@PathVariable Long inventoryId, @RequestParam int quantity) {
        return inventoryService.updateStock(inventoryId, -quantity);
    }
}
