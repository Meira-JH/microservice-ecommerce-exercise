package com.store.order.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.store.order.domain.Order;
import com.store.order.service.interfaces.OrderServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/order")
public class OrderController extends GenericController<Order> {
    @Autowired
    public OrderServiceInterface service;
    public OrderController(OrderServiceInterface service) {
        super(service);
    }

    @PostMapping("create-order")
    public ResponseEntity<Void> createOrder(@RequestBody Order order) throws JsonProcessingException {
        service.createOrder(order);

        return ResponseEntity.ok().build();
    }
}