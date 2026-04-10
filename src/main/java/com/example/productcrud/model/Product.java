package com.example.productcrud.model;

import java.time.LocalDate;

import jakarta.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 200)
    private String name;

    @Enumerated(EnumType.STRING)
    @Column(length = 50)
    private Category category;

    private long price;

    private int stock;

    @Column(columnDefinition = "TEXT")
    private String description;

    private boolean active;
}