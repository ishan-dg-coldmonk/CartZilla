package com.ecommerce.cartzilla.backend.controller;

import com.ecommerce.cartzilla.backend.entity.Product;
import com.ecommerce.cartzilla.backend.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
     private ProductService productService;

     @GetMapping("/api/products")
     public List<Product> getAllProducts() {
         return productService.getAllProducts();
     }

     @GetMapping("/api/products/{id}")
     public Product getProductById(@PathVariable Long id) {
         return productService.getProductById(id);
     }

     @PostMapping("/api/products")
     public Product addProduct(@RequestBody Product product) {
         return productService.saveProduct(product);
     }
}
