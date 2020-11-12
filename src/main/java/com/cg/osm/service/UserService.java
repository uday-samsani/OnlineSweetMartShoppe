package com.cg.osm.service;

import com.cg.osm.entites.User;

public interface UserService {
	public User addUser(User user);
	public User updateUser(User user);
	public User cancelUser(User user);
	public User showAllUsers(User user);
}
