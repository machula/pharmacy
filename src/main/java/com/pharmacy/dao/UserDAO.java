package com.pharmacy.dao;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.springframework.beans.factory.annotation.Autowired;

import com.pharmacy.dao.impl.DaoImpl;
import com.pharmacy.entity.User;

public class UserDAO implements DaoImpl<User> {

	@Autowired
	EntityManagerFactory entityManagerFactory;
	
	@Override
	public Optional<User> get(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		//return entityManager.createQuery()
		return entityManager.createQuery("from User ").getResultList();
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
