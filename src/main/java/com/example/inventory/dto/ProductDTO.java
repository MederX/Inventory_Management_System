package com.example.inventory.dto;

public class ProductDTO {
    private Long id;
    private String name;
    private String categoryName;
    private int stock;

    // Constructors
    public ProductDTO(Long id, String name, String categoryName, int stock) {
        this.id = id;
        this.name = name;
        this.categoryName = categoryName;
        this.stock = stock;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
