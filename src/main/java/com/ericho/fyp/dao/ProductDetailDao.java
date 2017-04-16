package com.ericho.fyp.dao;

import com.ericho.fyp.model.Product;
import com.ericho.fyp.model.ProductQuantity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by steve_000 on 15/4/2017.
 */
public interface ProductDetailDao extends JpaRepository<ProductQuantity, Long> {

}
