package com.example.spring1607.service.order;

import com.example.spring1607.facade.order.OrderDTO;

import java.util.ArrayList;

public interface OrderService {

    OrderDTO create(OrderDTO dto);

    OrderDTO getById(Long id);

    ArrayList<OrderDTO> getAll();

    void deleteById(Long id);
}
