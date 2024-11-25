package com.example.InternetCatalog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
@Controller
public class ControllerInt {

    @Autowired
    ProductService productService; // проверка

    public ControllerInt() {
        System.out.println("Создается контроллер");
    }

    @GetMapping("/")
    public String getAllProducts(Model model) {
        model.addAttribute("products", productService.getProducts());
        return "index";
    }

    @GetMapping("/product/{id}")
    public String getProductById(@PathVariable int id, Model model) {
        Product product = productService.getProductById(id);
        if (product != null) {
            model.addAttribute("product", product);
            return "product";  // название HTML-шаблона для деталей товара
        }
        return "redirect:/";  // если не найден, вернуться на главную
    }

    @GetMapping("/prodInfo")
    public String getOneProduct( String id, Model model) {
        try {
            int i = Integer.parseInt(id);
            Product product = productService.getProductById(i);
            if (product != null) {
                model.addAttribute("product", product);
                return "product";  // название HTML-шаблона для деталей товара
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return "redirect:/";  // если не найден, вернуться на главную
    }
    @GetMapping("/deleteProd")
    public String deleteProduct( String id, Model model) {
        try {
            int i = Integer.parseInt(id);
            productService.removeById(i);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return "redirect:/";  // если не найден, вернуться на главную
    }
}


