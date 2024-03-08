package com.store.order.service;

import com.store.order.domain.OrderItem;
import com.store.order.repository.OrderItemRepository;
import com.store.order.service.interfaces.OrderItemServiceInterface;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component
public class OrderItemService extends GenericService<OrderItem, Long, OrderItemRepository> implements OrderItemServiceInterface {
    public OrderItemService(OrderItemRepository repository) {
        super(repository);
    }
}