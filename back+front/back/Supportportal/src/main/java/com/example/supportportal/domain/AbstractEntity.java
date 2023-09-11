package com.example.supportportal.domain;

import java.io.Serializable;
import java.time.Instant;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class AbstractEntity implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue
    private Long id ;
	
    @CreatedDate
    @Column(name = "creationDate"  , nullable = false ,updatable = false)
    private Instant creationDate;
    
    
    @LastModifiedDate
    @Column(name = "lastModifiedDate" )
    private Instant lastModifiedDate;


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public Instant getCreationDate() {
		return creationDate;
	}


	public void setCreationDate(Instant creationDate) {
		this.creationDate = creationDate;
	}


	public Instant getLastModifiedDate() {
		return lastModifiedDate;
	}


	public void setLastModifiedDate(Instant lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	public AbstractEntity() {
		
	}


	public AbstractEntity(Long id, Instant creationDate, Instant lastModifiedDate) {
		super();
		this.id = id;
		this.creationDate = creationDate;
		this.lastModifiedDate = lastModifiedDate;
	}
    
    
    
}


