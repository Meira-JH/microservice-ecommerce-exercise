package com.store.product.service.interfaces;
import com.store.product.domain.Product;

import java.util.List;

public interface ProductServiceInterface {
    List <Product> getAll();

    Product get(Long id);

    void save(Product product);

    void update(Long id, Product product);

    void delete(Long id);
}