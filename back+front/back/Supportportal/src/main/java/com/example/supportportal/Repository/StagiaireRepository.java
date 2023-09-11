package com.example.supportportal.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.supportportal.domain.Stagiaire;


public interface StagiaireRepository  extends JpaRepository<Stagiaire, Long>{
	

}