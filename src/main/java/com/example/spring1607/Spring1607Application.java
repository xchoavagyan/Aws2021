package com.example.spring1607;

import com.example.spring1607.persistance.entities.Address;
import com.example.spring1607.persistance.entities.Order;
import com.example.spring1607.persistance.entities.Person;
import com.example.spring1607.persistance.entities.Product;
import com.example.spring1607.persistance.repos.OrderRepo;
import com.example.spring1607.service.order.OrderService;
import com.example.spring1607.service.order.OrderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;

@SpringBootApplication
public class Spring1607Application {

    public static void main(String[] args) {
        SpringApplication.run(Spring1607Application.class, args);



    }

}
