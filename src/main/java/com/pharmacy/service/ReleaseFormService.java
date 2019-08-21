package com.pharmacy.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pharmacy.dao.ReleaseFormDAO;
import com.pharmacy.entity.ReleaseForm;
import com.pharmacy.service.impl.ServiceImpl;

@Service
public class ReleaseFormService implements ServiceImpl<ReleaseForm> {

	@Autowired
	private ReleaseFormDAO releaseFormDAO;
	
	@Override
	public Optional<ReleaseForm> get(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ReleaseForm> getAll() {
		// TODO Auto-generated method stub
		return releaseFormDAO.getAll();
	}

	@Override
	public void save(ReleaseForm t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(ReleaseForm t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(ReleaseForm t) {
		// TODO Auto-generated method stub
		
	}
	
	
}
