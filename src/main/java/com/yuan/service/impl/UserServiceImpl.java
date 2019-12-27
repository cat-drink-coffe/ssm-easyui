package com.yuan.service.impl;


import java.util.List;
import java.util.Map;

import com.yuan.dao.UserDao;
import com.yuan.domain.User;
import com.yuan.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    public List<User> getAll() {
        return userDao.getAll();
    }

    public User getUser(User user) {
        return userDao.getUser(user);
    }

    public int delete(int id) {
        return userDao.delete(id);
    }

    public int update(User user) {
        return userDao.update(user);
    }

    public int add(User user) {
        return userDao.add(user);
    }

    public List<User> find(Map<String, Object> map) {
        return userDao.find(map);
    }

    public Long getTotal(Map<String, Object> map) {
        return userDao.getTotal(map);
    }

    public User getUserById(int id) {
        return userDao.getUserById(id);
    }
}