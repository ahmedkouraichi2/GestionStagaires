package com.example.supportportal.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.supportportal.domain.Recruteur;


@Repository
public interface RecreteurRepository  extends JpaRepository<Recruteur, Long>{

}
