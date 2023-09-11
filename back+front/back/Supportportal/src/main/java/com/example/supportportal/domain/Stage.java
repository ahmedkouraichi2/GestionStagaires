package com.example.supportportal.domain;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Stage  extends AbstractEntity{
	 private String titreStage;
		private String typeStage;
		private String description;
		@JsonFormat(pattern = "yyyy-MM-dd")
		private Date dateFinStage;
		@JsonFormat(pattern = "yyyy-MM-dd")
		private Date dateDebutStage;
		private String duree;
		private Boolean attestation;
		private String pdf;
		private String nomService;
		@ManyToOne
		@JoinColumn(name = "encad_id")
		
		private Encadreur encadreur;
		@ManyToMany(fetch = FetchType.LAZY)
		@JsonIgnore
		

		private Set<Stagiaire> stagiaires;
		
		private long userId ;
		
		public void addStagiaire(Stagiaire stagiaire ) {
			if (this.stagiaires==null ) {this.stagiaires = new HashSet<Stagiaire>();}
			
			this.stagiaires.add(stagiaire);
			if ( stagiaire.getStages()==null ) {stagiaire.setStages(new HashSet<Stage>());}
			 stagiaire.getStages().add(this);
			 
			 
	}

}
