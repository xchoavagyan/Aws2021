package com.example.spring1607.persistance.repos;

import com.example.spring1607.persistance.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepo extends JpaRepository<Order,Long> {
}
