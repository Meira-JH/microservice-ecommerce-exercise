package com.store.product.service;

import com.store.product.domain.Product;
import com.store.product.repository.ProductRepository;
import com.store.product.service.interfaces.ProductServiceInterface;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
@AllArgsConstructor
@Component
public class ProductService implements ProductServiceInterface {
    @Autowired
    private ProductRepository repository;

    @Override
    public List<Product> getAll() {
        return repository.findAll();
    }

    @Override
    public Product get(Long id){
        return repository.findById(id).orElseThrow(() -> new NoSuchElementException("Produto não encontrado com o ID: " + id));
    }

    @Override
    public void save(Product product){
        repository.save(product);
    }

    @Override
    public void update(Long id, Product product){
        product.setId(id);
        repository.save(product);
    }

    @Override
    public void delete(Long id){
        repository.deleteById(id);
    }
}