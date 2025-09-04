package com.spring.ecommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.spring.ecommerce.models.Order;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {}