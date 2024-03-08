package com.store.order.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.store.order.domain.Order;
import com.store.order.repository.OrderItemRepository;
import com.store.order.repository.OrderRepository;
import com.store.order.service.interfaces.OrderServiceInterface;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component
public class OrderService extends GenericService<Order, Long, OrderRepository> implements OrderServiceInterface {
    private final AmqpTemplate rabbitTemplate;

    @Autowired
    private OrderItemRepository orderItemRepository;

    @Value("${rabbitmq.exchange.name}")
    String exchange;

    @Value("${rabbitmq.routing.key}")
    private String routingkey;

    public OrderService(OrderRepository repository, AmqpTemplate rabbitTemplate) {
        super(repository);
        this.rabbitTemplate = rabbitTemplate;
    }

    public Order createOrder(Order order) {
        Order ord = repository.save(order);

        return ord;
    }

    public void sendNotification(Order order) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.registerModule(new JavaTimeModule());

        String json = objectMapper.writeValueAsString(order);

        rabbitTemplate.convertAndSend(exchange,routingkey,json);
    }
}