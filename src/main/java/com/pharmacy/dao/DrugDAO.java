package com.pharmacy.dao;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.hibernate.Criteria;
import org.springframework.beans.factory.annotation.Autowired;

import com.pharmacy.dao.impl.DaoImpl;
import com.pharmacy.entity.Drug;

public class DrugDAO implements DaoImpl<Drug>{

	@Autowired
	EntityManagerFactory entityManagerFactory;
	
	@Override
	public Optional<Drug> get(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Drug> getAll() {
		// TODO Auto-generated method stub
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		//return entityManager.createQuery()
		return entityManager.createQuery("from Drug ").getResultList();
	}

	@Override
	public void save(Drug t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Drug t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Drug t) {
		// TODO Auto-generated method stub
		
	}

}
