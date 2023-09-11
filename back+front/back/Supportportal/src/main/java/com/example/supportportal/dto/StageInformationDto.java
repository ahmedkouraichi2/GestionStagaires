package com.example.supportportal.dto;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import com.example.supportportal.domain.Stage;
import com.example.supportportal.domain.Stagiaire;
import com.fasterxml.jackson.annotation.JsonFormat;


public class StageInformationDto {
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

	    private Long encadreurId;
	    private String encadreurfullname;


	    private Set<Long> stagiaireIds;
	    private Set<String> stagiairefullnames;


	    private long userId ;
	    
	    public StageInformationDto(){
	    	
	    }
	    
	    public static StageInformationDto entityToDto(Stage stage) {
	        Set<Long> ids= new HashSet<>();
	        Set<String> names= new HashSet<>();

	        for (Stagiaire stagiaire:stage.getStagiaires()) {
	            ids.add(stagiaire.getId());

	        }

	        for (Stagiaire stagiaire:stage.getStagiaires()) {
	            names.add(stagiaire.getFullname());

	        }

	        StageInformationDto stageInformationsDto = new StageInformationDto();
	        stageInformationsDto.setId(stage.getId());
	        stageInformationsDto.setDateDebutStage(stage.getDateDebutStage());
	        stageInformationsDto.setDateFinStage(stage.getDateFinStage());
	        stageInformationsDto.setTitreStage(stage.getTitreStage());

	        stageInformationsDto.setDescription(stage.getDescription());
	        stageInformationsDto.setAttestation(stage.getAttestation());
	        stageInformationsDto.setPdf(stage.getPdf());

	        stageInformationsDto.setNomService(stage.getNomService());
	        stageInformationsDto.setTypeStage(stage.getTypeStage());
	        stageInformationsDto.setEncadreurId(stage.getEncadreur().getId());
	        stageInformationsDto.setEncadreurfullname(stage.getEncadreur().getFullname());
	        stageInformationsDto.setStagiaireIds(ids);
	        stageInformationsDto.setStagiairefullnames(names);
	        return stageInformationsDto;
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
		public Long getId() {
			return Id;
		}
		public void setId(Long id) {
			Id = id;
		}
		public Long getEncadreurId() {
			return encadreurId;
		}
		public void setEncadreurId(Long encadreurId) {
			this.encadreurId = encadreurId;
		}
		public String getEncadreurfullname() {
			return encadreurfullname;
		}
		public void setEncadreurfullname(String encadreurfullname) {
			this.encadreurfullname = encadreurfullname;
		}
		public Set<Long> getStagiaireIds() {
			return stagiaireIds;
		}
		public void setStagiaireIds(Set<Long> stagiaireIds) {
			this.stagiaireIds = stagiaireIds;
		}
		public Set<String> getStagiairefullnames() {
			return stagiairefullnames;
		}
		public void setStagiairefullnames(Set<String> stagiairefullnames) {
			this.stagiairefullnames = stagiairefullnames;
		}
		public long getUserId() {
			return userId;
		}
		public void setUserId(long userId) {
			this.userId = userId;
		}
	    
	    
	    
}
