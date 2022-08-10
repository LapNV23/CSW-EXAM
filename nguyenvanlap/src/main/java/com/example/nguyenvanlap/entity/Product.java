package com.example.nguyenvanlap.entity;

import com.example.nguyenvanlap.entity.base.BaseEntity;
import com.example.nguyenvanlap.entity.enums.ProductStatus;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
@Table(name = "products")
public class Product {
    @Id
    private String id;
    private String name;
    private double price;
    private int quantity;
}
