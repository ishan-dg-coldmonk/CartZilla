package com.ecommerce.cartzilla.backend.service;

import com.ecommerce.cartzilla.backend.entity.Product;

import java.util.List;

public interface ProductService {

    List<Product> getAllProducts();
    Product saveProduct(Product product);
    Product getProductById(Long id);
}
