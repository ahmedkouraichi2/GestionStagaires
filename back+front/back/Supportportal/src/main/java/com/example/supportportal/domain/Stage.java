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



		public String getTitreStage() {
			return titreStage;
		}



		public void setTitreStage(String titreStage) {
			this.titreStage = titreStage;
		}



		public String getTypeStage() {
			return typeStage;
		}



		public void setTypeStage(String typeStage) {
			this.typeStage = typeStage;
		}



		public String getDescription() {
			return description;
		}



		public void setDescription(String description) {
			this.description = description;
		}



		public Date getDateFinStage() {
			return dateFinStage;
		}



		public void setDateFinStage(Date dateFinStage) {
			this.dateFinStage = dateFinStage;
		}



		public Date getDateDebutStage() {
			return dateDebutStage;
		}



		public void setDateDebutStage(Date dateDebutStage) {
			this.dateDebutStage = dateDebutStage;
		}



		public String getDuree() {
			return duree;
		}



		public void setDuree(String duree) {
			this.duree = duree;
		}



		public Boolean getAttestation() {
			return attestation;
		}



		public void setAttestation(Boolean attestation) {
			this.attestation = attestation;
		}



		public String getPdf() {
			return pdf;
		}



		public void setPdf(String pdf) {
			this.pdf = pdf;
		}



		public String getNomService() {
			return nomService;
		}



		public void setNomService(String nomService) {
			this.nomService = nomService;
		}



		public Encadreur getEncadreur() {
			return encadreur;
		}



		public void setEncadreur(Encadreur encadreur) {
			this.encadreur = encadreur;
		}



		public Set<Stagiaire> getStagiaires() {
			return stagiaires;
		}



		public void setStagiaires(Set<Stagiaire> stagiaires) {
			this.stagiaires = stagiaires;
		}



		public long getUserId() {
			return userId;
		}



		public void setUserId(long userId) {
			this.userId = userId;
		}



		public Stage(String titreStage, String typeStage, String description, Date dateFinStage, Date dateDebutStage,
				String duree, Boolean attestation, String pdf, String nomService, Encadreur encadreur,
				Set<Stagiaire> stagiaires, long userId) {
			super();
			this.titreStage = titreStage;
			this.typeStage = typeStage;
			this.description = description;
			this.dateFinStage = dateFinStage;
			this.dateDebutStage = dateDebutStage;
			this.duree = duree;
			this.attestation = attestation;
			this.pdf = pdf;
			this.nomService = nomService;
			this.encadreur = encadreur;
			this.stagiaires = stagiaires;
			this.userId = userId;
		}
		
		public Stage() {
			
		}
		
		

}
