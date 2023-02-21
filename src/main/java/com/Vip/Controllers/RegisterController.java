package com.Vip.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Vip.Models.UserRegisterationModel;
import com.Vip.Services.UserRegisterService;

@RestController
@CrossOrigin(origins = "http://localhost:4200/")
@RequestMapping("/homepage")
public class RegisterController {
    @Autowired
    UserRegisterService userSer;
   @PostMapping("/registration")
    public UserRegisterationModel addValues(@RequestBody UserRegisterationModel reg) throws Exception{
	   String emailId= reg.getEmail();
	   if (emailId!=null && !"".equals(emailId)) {
		   UserRegisterationModel regEmail = userSer.getEmailForValidation(emailId);
		   if (regEmail !=null) {
			throw new Exception("User with "+emailId+" is already availabel");
		}
	   }
       return this.userSer.addData(reg);
   }
   

   

}
