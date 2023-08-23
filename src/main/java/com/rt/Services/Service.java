package com.rt.Services;


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

}
