package com.store.notification.service;

import com.store.notification.service.interfaces.RabbitMQServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

public class RabbitMQService implements RabbitMQServiceInterface {

    private final WebClient webclient;

    public RabbitMQService(WebClient webclient){
        this.webclient = webclient;
    }
    @Value("${rabbitmq.queue.name}")
    String  queueName;

    @Autowired
    private EmailService email;

    @RabbitListener(queues = "${rabbitmq.queue.name}")
    public void handleMessage(String message) {

        String response = this.webclient.get()
                .uri("/user/1")
                .retrieve()
                .bodyToMono(String.class)
                .block();

        System.out.println(message);
        System.out.println(response);
        System.out.println("Comunicação feita com sucesso!");
    }
}
