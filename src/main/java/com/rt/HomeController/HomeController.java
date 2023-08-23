package com.rt.HomeController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rt.Entityes.Entityes;
import com.rt.Services.Service;

@RestController
public class HomeController {

	@Autowired
	Service s;
	
	@PostMapping("/added")
	public String add(@RequestBody Entityes e) {
	
		s.add(e);
		
		return"Emp Added Successfully....!";

	}
	
}
