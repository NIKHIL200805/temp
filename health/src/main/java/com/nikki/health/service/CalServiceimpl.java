package com.nikki.health.service;

import java.util.List;

import com.nikki.health.entities.Cal;
import com.nikki.health.repos.CalRepository;

public class CalServiceimpl implements CalService {
private CalRepository repo2;
	@Override
	public Cal saveCal(Cal cal) {
		// TODO Auto-generated method stub
		return repo2.save(cal);
	}

	@Override
	public Cal updateCal(Cal cal) {
		// TODO Auto-generated method stub
		return repo2.save(cal);
	}

	@Override
	public void deleteCal(Cal cal) {
		// TODO Auto-generated method stub
   repo2.delete(cal);
	}

	@Override
	public Object getCalById(String id) {
		// TODO Auto-generated method stub
		return repo2.findById(id);
	}

	@Override
	public List<Cal> getAllCals() {
		// TODO Auto-generated method stub
		return repo2.findAll();
	}

}
