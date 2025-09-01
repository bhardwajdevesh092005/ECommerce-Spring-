package com.spring.ecommerce.models;

import jakarta.persistence.*;

@Entity
@Table(name = "media")
public class Media {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String url;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_media",referencedColumnName = "id")
    private Product product;
}
