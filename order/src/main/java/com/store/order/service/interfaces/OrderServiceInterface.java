package com.store.order.service.interfaces;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.store.order.domain.Order;

public interface OrderServiceInterface extends GenericServiceInterface<Order>{
    void sendNotification(Order order) throws JsonProcessingException;

    Order createOrder(Order order);
}