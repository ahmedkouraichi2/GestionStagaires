package com.example.supportportal.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.supportportal.domain.Stage;


@Repository
public interface StageRepository  extends JpaRepository<Stage, Long>{

	
	
}
