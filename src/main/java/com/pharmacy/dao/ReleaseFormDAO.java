package com.pharmacy.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.pharmacy.dao.impl.DaoImpl;
import com.pharmacy.entity.ReleaseForm;
import com.pharmacy.hibernate.HibernateUtil;

@Repository
public class ReleaseFormDAO implements DaoImpl<ReleaseForm>{
	
	//private SessionFactory sessionFactory;
	
	@Autowired
	EntityManagerFactory entityManagerFactory;
	
	@Override
	@Transactional
	public Optional<ReleaseForm> get(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@SuppressWarnings("unchecked")
	@Override
	@Transactional
	public List<ReleaseForm> getAll() {
		// TODO Auto-generated method stub
		/*List<ReleaseForm> list = new ArrayList<ReleaseForm>();
		sessionFactory = HibernateUtil.getSessionFactory();
		session = sessionFactory.getCurrentSession();
		transaction = session.beginTransaction();
		list = session.createQuery("from ReleaseForm").getResultList();
		transaction.commit();
		return list;*/
		//sessionFactory = HibernateUtil.getSessionFactory();
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		return entityManager.createQuery("from ReleaseForm").getResultList();
	}

	@Override
	@Transactional
	public void save(ReleaseForm t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	@Transactional
	public void update(ReleaseForm t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	@Transactional
	public void delete(ReleaseForm t) {
		// TODO Auto-generated method stub
		
	}
	
}
