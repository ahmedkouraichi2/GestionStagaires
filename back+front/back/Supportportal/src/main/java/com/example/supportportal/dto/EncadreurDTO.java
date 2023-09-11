package com.example.supportportal.dto;

import java.util.Date;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


public class EncadreurDTO {
	
	private Long id;
	@NotNull(message="it should be not null")
	private String fullname;
    //@Pattern(regexp="^[0-9]{10}$",message="it should be a number ")
	private String telephone;
    @Email(regexp = "(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])",message="it should be an email ")
	private String email;
	//@JsonFormat(pattern = "yyyy/MM/dd")
	private Date datenaissance;
	@Size(min=2, max=31)
	private String adresse;
	private String fonctionEncad;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getDatenaissance() {
		return datenaissance;
	}
	public void setDatenaissance(Date datenaissance) {
		this.datenaissance = datenaissance;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getFonctionEncad() {
		return fonctionEncad;
	}
	public void setFonctionEncad(String fonctionEncad) {
		this.fonctionEncad = fonctionEncad;
	}
	
	public EncadreurDTO() {
	
	
	}
	public EncadreurDTO(Long id, @NotNull(message = "it should be not null") String fullname, String telephone,
			@Email(regexp = "(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])", message = "it should be an email ") String email,
			Date datenaissance, @Size(min = 2, max = 31) String adresse, String fonctionEncad) {
		super();
		this.id = id;
		this.fullname = fullname;
		this.telephone = telephone;
		this.email = email;
		this.datenaissance = datenaissance;
		this.adresse = adresse;
		this.fonctionEncad = fonctionEncad;
	}
	
	
	
	

}
