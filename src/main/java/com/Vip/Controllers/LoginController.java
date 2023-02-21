package com.Vip.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Vip.Models.UserRegisterationModel;
import com.Vip.Services.UserRegisterService;


@RestController
@RequestMapping("login")
@CrossOrigin(origins = "http://localhost:4200/")
public class LoginController {

	@Autowired
	UserRegisterService uServices;
	@PostMapping("loginValidation")
	public ResponseEntity<UserRegisterationModel>  loginUser(@RequestBody UserRegisterationModel regi) throws Exception {
		String tempEmail=regi.getEmail();
		String tempPassword=regi.getPassword(); 
		System.out.println(tempEmail);
		System.out.println(tempPassword);
		UserRegisterationModel valLogin = null;
		if (tempEmail !=null && tempPassword !=null	) {
			 valLogin=uServices.fetchEmailIdAndPassword(tempEmail, tempPassword);
			 System.out.println(valLogin.toString());
		}
		if(valLogin==null) {
			
			throw new Exception(" Email and Password is wrong ");
			
			
		}
		return new ResponseEntity<>(valLogin,HttpStatus.OK);
	}
}
