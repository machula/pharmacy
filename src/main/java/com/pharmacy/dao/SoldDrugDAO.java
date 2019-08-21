package com.pharmacy.dao;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.springframework.beans.factory.annotation.Autowired;

import com.pharmacy.dao.impl.DaoImpl;
import com.pharmacy.entity.Product;
import com.pharmacy.entity.SoldDrug;

public class SoldDrugDAO  implements DaoImpl<SoldDrug>{
	
	@Autowired
	EntityManagerFactory entityManagerFactory;

	@Override
	public Optional<SoldDrug> get(long id) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		return Optional.of(entityManager.createQuery("from SoldDrug s where s.id = :id").getResultList());
	}

	@Override
	public List<SoldDrug> getAll() {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		return entityManager.createQuery("from SoldDrug ").getResultList();
	}

	public List<SoldDrug> getByStock(int id){
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		return entityManager.createQuery("from SoldDrug where stock_id = 1").getResultList();
	}
	@Override
	public void save(SoldDrug t) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.persist(t);	
	}

	@Override
	public void update(SoldDrug t) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.merge(t);
	}

	@Override
	public void delete(SoldDrug t) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		t = entityManager.merge(t);
        entityManager.remove(t);
	}
}
