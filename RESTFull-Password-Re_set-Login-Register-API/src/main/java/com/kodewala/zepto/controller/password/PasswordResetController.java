package com.kodewala.zepto.controller.password;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kodewala.zepto.bean.ResetPassword;
import com.kodewala.zepto.service.ResetPasswordImpl;


@RestController
public class PasswordResetController {
	
	@Autowired
	ResetPasswordImpl resetPasswordImpl;
	
	
	@PostMapping("reSetPassword")
	public String resetPassword(@RequestBody ResetPassword resetPassword) {
		
		String message=resetPasswordImpl.resetPassword(resetPassword);
		
		return message;
	}

}
