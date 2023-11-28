package com.сontractсalculation.service;

import com.сontractсalculation.dto.OrderInfoDTO;
import com.сontractсalculation.model.Order;
import com.сontractсalculation.model.PreOrder;

import java.util.List;
import java.util.Optional;

public interface OrderService {
    List<OrderInfoDTO> findAll();
    Order createOrUpdate(Order order);
    PreOrder calculatePreorder(PreOrder preOrder);
    Optional<Order> findByNumberOrder(String number);
}
