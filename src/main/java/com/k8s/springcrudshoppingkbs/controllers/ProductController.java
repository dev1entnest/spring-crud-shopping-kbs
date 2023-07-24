package com.k8s.springcrudshoppingkbs.controllers;

import com.k8s.springcrudshoppingkbs.entities.Product;
import com.k8s.springcrudshoppingkbs.services.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
@Slf4j
public class ProductController {
    @Autowired
    private ProductService productService;

    @PostMapping
    public Product saveProduct(@RequestBody Product product){
        log.info("saving product with name {}", product);
        return productService.saveProduct(product);
    }

    @GetMapping("/{productId}")
    public Product getProductById(@PathVariable("productId") Integer productId){
        return productService.getProductById(productId);
    }

    @GetMapping
    public List<Product> findAllProducts(){
        return productService.getAllProducts();
    }

    @DeleteMapping("/{productId}")
    public String deleteProduct(@PathVariable("productId") Integer productId){
        productService.deleteProduct(productId);
        return "product successfully delete with given id";
    }

    @PutMapping("/{productId}")
    public Product updateProduct(@RequestBody Product product, @PathVariable("productId") Integer productId){
        return productService.updateProduct(product, productId);
    }
}
