package com.k8s.springcrudshoppingkbs.services;

import com.k8s.springcrudshoppingkbs.entities.Product;

import java.util.List;

public interface ProductService {
    Product saveProduct(Product product);
    Product getProductById(Integer id);
    List<Product> getAllProducts();
    Product updateProduct(Product product, Integer id);
    void deleteProduct(Integer id);
}
