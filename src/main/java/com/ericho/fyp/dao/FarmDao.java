package com.ericho.fyp.dao;

import com.ericho.fyp.model.Farm;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.ericho.fyp.model.Product;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface FarmDao extends JpaRepository<Farm, Long> {

}
