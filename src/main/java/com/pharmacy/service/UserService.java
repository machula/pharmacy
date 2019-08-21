package com.pharmacy.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.pharmacy.dao.UserDAO;
import com.pharmacy.entity.User;
import com.pharmacy.service.impl.ServiceImpl;

public class UserService implements ServiceImpl<User>{
	
	@Autowired
	UserDAO userDAO;

	@Override
	public Optional<User> get(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return userDAO.getAll();
	}

	@Override
	public void save(User t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(User t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(User t) {
		// TODO Auto-generated method stub
		
	}

}
