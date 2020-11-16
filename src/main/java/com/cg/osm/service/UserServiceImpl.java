package com.cg.osm.service;

import javax.persistence.EntityManager;
import com.cg.osm.repository.UserRepository;
import com.cg.osm.repository.UserRepositoryImpl;

import com.cg.osm.entites.User;

public class UserServiceImpl implements UserService{
	
	UserRepository dao;
	
	public UserServiceImpl() {
		dao = new UserRepositoryImpl();
	}

	public User addUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	public User updateUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	public User cancelUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	public User showAllUsers(User user) {
		// TODO Auto-generated method stub
		return null;
	}

}
