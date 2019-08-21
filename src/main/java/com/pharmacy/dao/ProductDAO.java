package com.pharmacy.dao;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.springframework.beans.factory.annotation.Autowired;

import com.pharmacy.dao.impl.DaoImpl;
import com.pharmacy.entity.Product;

public class ProductDAO implements DaoImpl<Product> {
	
	@Autowired
	EntityManagerFactory entityManagerFactory;
	
	@Override
	public Optional<Product> get(long id) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		return Optional.of(entityManager.createQuery("from Product s where s.id = :id").getResultList());
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		//return entityManager.createQuery()
		return entityManager.createQuery("from Product ").getResultList();
	}
	
	public List<Product> getByStock(int id){
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		return entityManager.createQuery("from Product where stock_id = 1").getResultList();
	}

	@Override
	public void save(Product t) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.persist(t);			
	}

	@Override
	public void update(Product t) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.persist(t);	
		
	}

	@Override
	public void delete(Product t) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		t = entityManager.merge(t);
        entityManager.remove(t);
		
	}

}
