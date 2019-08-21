package com.pharmacy.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.pharmacy.dao.SoldDrugDAO;
import com.pharmacy.entity.Product;
import com.pharmacy.entity.SoldDrug;
import com.pharmacy.service.impl.ServiceImpl;

public class SoldDrugService implements ServiceImpl<SoldDrug> {

	@Autowired
	SoldDrugDAO soldDrugDAO;

	@Override
	public Optional<SoldDrug> get(long id) {
		// TODO Auto-generated method stub
		return soldDrugDAO.get(id);
	}

	@Override
	public List<SoldDrug> getAll() {
		return soldDrugDAO.getAll();
	}

	public List<SoldDrug> getByStock(int id){
		return soldDrugDAO.getByStock(id);
	}
	
	@Override
	public void save(SoldDrug t) {
		soldDrugDAO.save(t);
		
	}

	@Override
	public void update(SoldDrug t) {
		soldDrugDAO.update(t);
		
	}

	@Override
	public void delete(SoldDrug t) {
		soldDrugDAO.delete(t);
		
	}
}
