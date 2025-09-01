package com.spring.ecommerce.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
import java.util.concurrent.CompletionException;

@Entity
@Data
@Table(name = "user")
public class User{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Embedded
    private UserName name;

    private String email;
    private String password;

    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL)
    private List<Order> orders;

    @OneToMany
    private List<WishList> wishList;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Address> addresses;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<CartItem> items;

    @OneToMany
    private List<Comment> comments;

    @OneToOne
    @JoinColumn(name = "profile_picture", referencedColumnName = "id")
    private Media profilePicture;
}
