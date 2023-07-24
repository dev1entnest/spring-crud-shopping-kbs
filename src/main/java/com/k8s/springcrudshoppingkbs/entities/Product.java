package com.k8s.springcrudshoppingkbs.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer productId;
    private String productName;
    private Date createdAt;
    private Date updatedAt;

    @PrePersist
    protected void onCreate(){
        createdAt=new Date();
    }
    @PreUpdate
    protected void onUpdate() {
        updatedAt=new Date();
    }
}
