package com.spring.ecommerce.models;

import jakarta.persistence.Embeddable;
import lombok.Data;

@Embeddable
@Data
public class UserName {
    private String firstName;
    private String lastName;
}
