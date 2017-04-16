package com.ericho.coupleShare.service;

import com.ericho.coupleShare.model.User;


public interface UserService {
    void save(User user);

    void changePassword(Long id, String originPassword, String newPassword);

    boolean checkLogin(String username, String password);

    void delete(User user);
}
