package com.ericho.fyp.service;

import com.ericho.fyp.dao.UserDao;
import com.ericho.fyp.model.User;
import com.ericho.fyp.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class UserServiceImpl implements UserService {
    @Autowired
    public UserDao userDao;

    @Override
    public void save(User user) {
        userDao.save(user);
    }

    @Override
    public void changePassword(Long id, String originPassword,
                               String newPassword) {

    }

    @Override
    public boolean checkLogin(String username, String password) {
        User user = this.userDao.findByUsername(username);

        return StringUtil.equal(password, user.getPassword());
    }

    @Override
    public void delete(User user) {

        userDao.delete(user);
    }

}
