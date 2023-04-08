package com.maziv5.service.impl;
/*
 * @author maziV5
 * @version 1.0
 */

import com.maziv5.dao.UserDao;
import com.maziv5.domain.User;
import com.maziv5.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public boolean reg(User user) {
        return userDao.reg(user) > 0;
    }

    @Override
    public boolean update(User user) {
        return userDao.update(user) > 0;
    }

    @Override
    public boolean delete(Integer id) {
        return userDao.delete(id) > 0;
    }

    @Override
    public User getById(Integer id) {
        return userDao.getById(id);
    }

    @Override
    public List<User> getAll() {
        return userDao.getAll();
    }

    @Override
    public User login(String user_name, String password) {
        return userDao.login(user_name,password);
    }

    @Override
    public User register(String user_name) {
        return userDao.register(user_name);
    }

    @Override
    public User getByUsername(String user_name) {
        return userDao.getByUsername(user_name);
    }
}
