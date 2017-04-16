package com.ericho.fyp.service;

import com.ericho.fyp.model.User;


public interface UserService {
    void save(User user);

    void changePassword(Long id, String originPassword, String newPassword);

    boolean checkLogin(String username, String password);

    void delete(User user);
}
