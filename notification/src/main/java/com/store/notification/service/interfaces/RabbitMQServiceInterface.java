package com.store.notification.service.interfaces;

public interface RabbitMQServiceInterface {
    void handleMessage(String message);
}
