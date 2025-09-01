package com.spring.ecommerce;

import com.spring.ecommerce.models.Product;
import org.springframework.context.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ECommerceApplication {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(ECommerceApplication.class, args);
    }
}