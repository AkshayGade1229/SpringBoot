package com.rt.Dao;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.rt.Entityes.Entityes;

public interface Dao extends JpaRepository<Entityes, Integer>{

	
	
	 List<Entityes> findByName(String name);
	
	//@Query(value= "select * from spring_boot where name = ?",nativeQuery = true )
	//List<Entityes> xyz (String name);

		
		// JPQL
		@Query(value= "select e from Entityes e where e.name=:n", nativeQuery = false)
	List<Entityes> xyz (@Param("n") String n);

}


