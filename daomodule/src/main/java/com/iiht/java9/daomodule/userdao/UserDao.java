package com.iiht.java9.daomodule.userdao;

import com.iiht.java9.daomodule.Dao;
import com.iiht.java9.entity.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
public class UserDao implements Dao<User> {
	 
    private  Map<Integer, User> users;
 
    // standard constructor
 
    public UserDao(Map<Integer, User> users2) {
		// TODO Auto-generated constructor stub
	}

	public Optional<User> findById(int id) {
        return Optional.ofNullable(users.get(id));
    }
 
    public List<User> findAll() {
        return new ArrayList<User>((users.values()));
    }
}