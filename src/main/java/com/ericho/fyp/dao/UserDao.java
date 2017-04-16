package com.ericho.fyp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.ericho.fyp.model.User;
import org.springframework.data.repository.PagingAndSortingRepository;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface UserDao extends JpaRepository<User, Long> {
    User findByUsername(String name);
}
