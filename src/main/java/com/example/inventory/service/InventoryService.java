package com.example.inventory.service;

import com.example.inventory.entity.Inventory;
import com.example.inventory.repository.InventoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InventoryService {
    @Autowired
    private InventoryRepository inventoryRepository;

    public Inventory updateStock(Long inventoryId, int quantity) {
        Inventory inventory = inventoryRepository.findById(inventoryId)
                .orElseThrow(() -> new RuntimeException("Inventory not found"));
        inventory.setStock(inventory.getStock() + quantity);
        return inventoryRepository.save(inventory);
    }
}
