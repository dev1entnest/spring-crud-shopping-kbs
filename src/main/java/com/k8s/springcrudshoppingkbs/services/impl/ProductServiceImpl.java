package com.k8s.springcrudshoppingkbs.services.impl;

import com.k8s.springcrudshoppingkbs.entities.Product;
import com.k8s.springcrudshoppingkbs.exceptions.ApplicationException;
import com.k8s.springcrudshoppingkbs.repositories.ProductRepository;
import com.k8s.springcrudshoppingkbs.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;
    @Override
    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Product getProductById(Integer id) {
        return productRepository.findById(id).orElseThrow(()->new ApplicationException("product not found with product id "+id));
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product updateProduct(Product product, Integer id) {
        Product oldProduct = productRepository.findById(id).orElseThrow(()-> new ApplicationException("product not found with product id "+id));
        oldProduct.setProductName(product.getProductName());
        return productRepository.save(oldProduct);
    }

    @Override
    public void deleteProduct(Integer id) {
        Product oldProduct = productRepository.findById(id).orElseThrow(()-> new ApplicationException("product not found with product id "+id));
        productRepository.delete(oldProduct);
    }
}
