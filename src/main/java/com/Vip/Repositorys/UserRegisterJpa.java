package com.Vip.Repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Vip.Models.UserRegisterationModel;

public interface UserRegisterJpa extends JpaRepository<UserRegisterationModel,Integer>{
	
	UserRegisterationModel findByEmail(String email);

	UserRegisterationModel findByEmailAndPassword(String email, String password);

}
