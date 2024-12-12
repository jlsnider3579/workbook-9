package com.pluralsight.NorthwindTradersSpringBoot;

import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class SimpleProductDao implements ProductDao {

    @Override
    public void add(Product product) {

    }

    @Override
    public List<Product> getAll() {
        return List.of();
    }
}
