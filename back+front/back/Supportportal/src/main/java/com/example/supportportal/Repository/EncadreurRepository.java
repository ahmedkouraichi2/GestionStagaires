package com.example.supportportal.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.supportportal.domain.Encadreur;


@Repository
public interface EncadreurRepository  extends JpaRepository<Encadreur, Long>{

}
