package com.ericho.fyp.service;

import com.ericho.fyp.model.Product;

import java.util.List;

/**
 * Created by steve_000 on 15/4/2017.
 */
public interface ProductService {
    List<Product> getAllProduct();

    List<Product> getByFarmId(Long farmId);
}
