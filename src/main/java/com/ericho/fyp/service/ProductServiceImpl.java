package com.ericho.fyp.service;

import com.ericho.fyp.dao.ProductDao;
import com.ericho.fyp.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by steve_000 on 15/4/2017.
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Override
    public List<Product> getAllProduct() {
        return productDao.findAll();
    }

    @Override
    public List<Product> getByFarmId(Long farmId) {
        return productDao.findAll();
    }
}
