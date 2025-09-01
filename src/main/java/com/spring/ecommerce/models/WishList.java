package com.spring.ecommerce.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "wishlist")
public class WishList {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
