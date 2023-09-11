package com.example.supportportal.dto;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class StageInfoListingDTO {
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
	private Long Id;
	
	private String encadreurfullname;

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

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getEncadreurfullname() {
		return encadreurfullname;
	}

	public void setEncadreurfullname(String encadreurfullname) {
		this.encadreurfullname = encadreurfullname;
	}

	public StageInfoListingDTO(String titreStage, String typeStage, String description, Date dateFinStage,
			Date dateDebutStage, String duree, Boolean attestation, String pdf, String nomService, Long id,
			String encadreurfullname) {
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
		Id = id;
		this.encadreurfullname = encadreurfullname;
	}

	public StageInfoListingDTO() {
		super();
	}
	
	
	
}
