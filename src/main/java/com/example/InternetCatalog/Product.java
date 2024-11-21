package com.example.InternetCatalog;

public class Product {
    private int id;
    private String name;
    private String imageUrl;

    public Product(int id, String name, String imageUrl) {
        this.id = id;
        this.name = name;
        this.imageUrl = imageUrl;
    }

    public int getId() {
        return id;
    }

    public String getName() {

        return name;
    }
    public String getImageUrl() { // Геттер для imageUrl
        return imageUrl;
    }
}


