package com.example.supportportal;



import org.junit.jupiter.api.Test;

import com.example.supportportal.domain.AppUser;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.Date;
public class AppUserTest {
	 @Test
	    public void testAppUserConstructor() {
	        // Création d'un objet AppUser
	        AppUser appUser = new AppUser();
	        
	        // Remplissage des données d'exemple
	        
	        appUser.setFullname("John Doe");
	        appUser.setTelephone("123456789");
	        appUser.setDatenaissance(new Date());
	        appUser.setAdresse("123 Main St");
	        appUser.setPassWord("password123");
	        appUser.setRole("ROLE_USER");
	        appUser.setEmail("john.doe@example.com");
	        
	       
	        
	        assertNotNull(appUser);
	        assertEquals("John Doe", appUser.getFullname());
	        assertEquals("123456789", appUser.getTelephone());
	        assertNotNull(appUser.getDatenaissance());
	        assertEquals("123 Main St", appUser.getAdresse());
	        assertEquals("password123", appUser.getPassWord());
	        assertEquals("ROLE_USER", appUser.getRole());
	        assertEquals("john.doe@example.com", appUser.getEmail());
	    }
}
