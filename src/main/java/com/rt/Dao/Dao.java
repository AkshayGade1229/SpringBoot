package com.rt.Dao;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rt.Entityes.Entityes;

public interface Dao extends JpaRepository<Entityes, Integer>{

	List<Entityes> findByName(String name);

}


