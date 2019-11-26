package com.nikki.health.service;

import java.util.List;

import com.nikki.health.entities.Cal;
public interface CalService {
Cal saveCal(Cal cal);
Cal updateCal(Cal cal);
void deleteCal(Cal cal);
Object getCalById(String id);
List<Cal> getAllCals();

}
	
	


