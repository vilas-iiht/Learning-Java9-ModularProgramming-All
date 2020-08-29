package com.iiht.java9.mainappmodule;

import java.util.HashMap;
import java.util.Map;

import com.iiht.java9.daomodule.Dao;
import com.iiht.java9.daomodule.userdao.UserDao;
import com.iiht.java9.entity.User;

public class Application {
    
    public static void main(String[] args) {
        Map<Integer, User> users = new HashMap<>();
        users.put(1, new User("Julie"));
        users.put(2, new User("David"));
        Dao<User> userDao = new UserDao(users);
        userDao.findAll().forEach(System.out::println);
    }   
}