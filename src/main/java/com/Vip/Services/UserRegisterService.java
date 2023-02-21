package com.Vip.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Vip.Models.UserRegisterationModel;
import com.Vip.Repositorys.UserRegisterJpa;

@Service
public class UserRegisterService {
	
	@Autowired
	UserRegisterJpa jpa;
    public UserRegisterationModel addData(UserRegisterationModel reg){
        return this.jpa.save(reg);
    }
    
//    get email id for register validation
    public UserRegisterationModel getEmailForValidation(String email) {
		return jpa.findByEmail(email);
	}
    
//   get email id and password for login validation 
    public UserRegisterationModel fetchEmailIdAndPassword(String email , String password) {
    	return jpa.findByEmailAndPassword(email, password);
		
	}

}
