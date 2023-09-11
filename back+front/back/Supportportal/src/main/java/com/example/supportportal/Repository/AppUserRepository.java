package com.example.supportportal.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.supportportal.domain.AppUser;



public interface AppUserRepository extends JpaRepository<AppUser, Long> {
	Optional <AppUser>  findUserByEmail(String email);
}
