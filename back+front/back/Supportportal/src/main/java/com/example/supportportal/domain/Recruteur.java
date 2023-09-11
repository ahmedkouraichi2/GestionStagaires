package com.example.supportportal.domain;

import javax.persistence.Entity;





@Entity

public class Recruteur extends AppUser{
	private String specialite;

	public String getSpecialite() {
		return specialite;
	}

	public void setSpecialite(String specialite) {
		this.specialite = specialite;
	}
	
	public Recruteur() {
		
	}

	public Recruteur(String specialite) {
		super();
		this.specialite = specialite;
	}
	
	
	
}