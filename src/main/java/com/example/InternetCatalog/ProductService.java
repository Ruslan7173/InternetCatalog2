package com.example.InternetCatalog;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ProductService {
    private List<Product> products = new ArrayList<>();

    public List<Product> getProducts() {
        return products;
    }

    public ProductService() {
        System.out.println("создается ProductService");
        products.add(new Product(1, "Шина Кама \"размер r16 205/55\"", "/static/Кама.jpg"));
        products.add(new Product(2, "Шина Кордиан \"r16 215/60\"", "/static/Кордиан.jpg"));
        products.add(new Product(3, "Шина Нордман \"r16 220/65\"", "/static/Нордман.jpg"));
    }

    public Product getProductById(int id) {
        for (Product product : products) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;  // если не найден, вернуться на главную
    }

    public void removeById(int id){
        Product p = getProductById(id);
        if(p != null)
            products.remove(p);
    }
}