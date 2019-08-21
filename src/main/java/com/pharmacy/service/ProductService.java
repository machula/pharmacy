package com.pharmacy.service;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;

import com.pharmacy.dao.ProductDAO;
import com.pharmacy.entity.Product;
import com.pharmacy.service.impl.ServiceImpl;

public class ProductService implements ServiceImpl<Product>{

	@Autowired
	ProductDAO productDAO;
	
	@Override
	public Optional<Product> get(long id) {
		// TODO Auto-generated method stub
		return productDAO.get(id);
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return productDAO.getAll();
	}

	public List<Product> getByStock(int id){
		return productDAO.getByStock(id);
	}
	
	@Override
	public void save(Product t) {
		productDAO.save(t);
		
	}

	@Override
	public void update(Product t) {
		productDAO.update(t);
		
	}

	@Override
	public void delete(Product t) {
		productDAO.delete(t);
		
	}

}
