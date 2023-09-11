package com.example.supportportal.domain;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;


	@Entity
public class Stagiaire extends AppUser {

	private String nomUniv;
	private String numCIN ;
	
	@ManyToMany (mappedBy = "stagiaires" ,fetch = FetchType.LAZY)
	private Set<Stage> stages;

	public String getNomUniv() {
		return nomUniv;
	}

	public void setNomUniv(String nomUniv) {
		this.nomUniv = nomUniv;
	}

	public String getNumCIN() {
		return numCIN;
	}

	public void setNumCIN(String numCIN) {
		this.numCIN = numCIN;
	}

	public Set<Stage> getStages() {
		return stages;
	}

	public void setStages(Set<Stage> stages) {
		this.stages = stages;
	}

	public Stagiaire(String nomUniv, String numCIN, Set<Stage> stages) {
		super();
		this.nomUniv = nomUniv;
		this.numCIN = numCIN;
		this.stages = stages;
	}
	
	
	
	 
	
	public Stagiaire() {
		
	}
	
	
	
	

	
	 }