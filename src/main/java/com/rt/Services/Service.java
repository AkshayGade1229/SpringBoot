package com.rt.Services;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.rt.Dao.Dao;
import com.rt.Entityes.Entityes;

@Component
public class Service {
	
	@Autowired
	Dao Dao;

	public void add(Entityes e){
		
		Dao.save(e);
		
	}

	public void update(Entityes e) {
		Dao.save(e);
		
	}

	public Optional<Entityes> findById(int id) {
		
		Optional<Entityes> e2 = Dao.findById(id);
		
		if (e2.isPresent()) {
			e2.get();
			return e2;

		}
		return null;
	}

	public Entityes deleteById(Entityes id) {
		Dao.delete(id);
		return null;
	}

}
