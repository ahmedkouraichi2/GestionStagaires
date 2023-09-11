package com.example.supportportal.domain;

import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;



@Entity

@DiscriminatorValue("encad")
public class Encadreur extends AppUser {

	private static final long serialVersionUID = 1L;
	private String fonctionEncad;
	@OneToMany(mappedBy="encadreur")
	@JsonIgnore
	private List<Stage> stages;
	public String getFonctionEncad() {
		return fonctionEncad;
	}
	public void setFonctionEncad(String fonctionEncad) {
		this.fonctionEncad = fonctionEncad;
	}
	public List<Stage> getStages() {
		return stages;
	}
	public void setStages(List<Stage> stages) {
		this.stages = stages;
	}
	
	public Encadreur(){
		
	}


}