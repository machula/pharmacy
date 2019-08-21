package com.pharmacy.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.pharmacy.dao.DrugDAO;
import com.pharmacy.entity.Drug;
import com.pharmacy.service.impl.ServiceImpl;

public class DrugService implements ServiceImpl<Drug>{

	@Autowired
	private DrugDAO drugDAO;
	
	@Override
	public Optional<Drug> get(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Drug> getAll() {
		// TODO Auto-generated method stub
		return drugDAO.getAll();
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
