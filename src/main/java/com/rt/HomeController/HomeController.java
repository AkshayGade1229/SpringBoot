package com.rt.HomeController;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
		
		return"Employee Added Successfully....!";

	}
	
	//-----------------------------	update---------------------------------------------------------------------------
	
		@PostMapping("/update")
		public String update(@RequestBody Entityes e) {
		
			s.update(e);
			
			return"Emp update Successfully....!";

		}
	//-----------------------------------Get Emp BY Id------------------------------------------------------------------
		@GetMapping("/id/{id}")
		public Optional<Entityes> findById(@PathVariable int id) {
		
			Optional<Entityes> e1 = s.findById(id);
			
			return e1;

		}
	//----------------------------------Delete Emp ---------------------------------------------------------------------------
		@DeleteMapping("/id/{id}")
		public String deleteById(@PathVariable Entityes id) {
		
			Entityes e2 = s.deleteById(id);
			
			return "Employee Deleted successfully....!";

		}
}
