package com.сontractсalculation.controller;

import com.сontractсalculation.dto.OrderInfoDTO;
import com.сontractсalculation.model.Order;
import com.сontractсalculation.model.PreOrder;
import com.сontractсalculation.service.OrderService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/order")
public class OrderController {
    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping("/calculate")
    public PreOrder calculatePreOrder(@Valid @RequestBody PreOrder preOrder) {
        return orderService.calculatePreorder(preOrder);
    }

    @PostMapping("/create")
    public ResponseEntity<Object> createOrder(@Valid @RequestBody Order order) {
        return ResponseEntity.ok(orderService.createOrUpdate(order));
    }

    @GetMapping("/all")
    public List<OrderInfoDTO> findAllOrders() {
        return orderService.findAll();
    }

    @GetMapping("/{number}")
    public ResponseEntity<Order> findOrderByNumber(@Valid @PathVariable String number) {
        Optional<Order> foundOrder = orderService.findByNumberOrder(number);
        if (foundOrder.isPresent()) {
            return new ResponseEntity<>(foundOrder.get(), HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);

    }
}
