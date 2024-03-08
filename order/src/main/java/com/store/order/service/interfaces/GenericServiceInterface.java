package com.store.order.service.interfaces;

import jakarta.persistence.Entity;
import java.util.List;

public interface GenericServiceInterface<T> {
    List<T> getAll();

    T get(Long id, String noSuchElementException);

    void save(T product);

    void update(T product);

    void delete(Long id);
}