package com.k8s.springcrudshoppingkbs.repositories;

import com.k8s.springcrudshoppingkbs.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
