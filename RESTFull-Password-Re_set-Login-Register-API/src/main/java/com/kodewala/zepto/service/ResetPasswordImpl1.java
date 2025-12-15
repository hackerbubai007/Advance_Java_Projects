package com.kodewala.zepto.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kodewala.zepto.bean.ResetPassword;
import com.kodewala.zepto.dao.ResetPasswordDAO1;

@Service
public class ResetPasswordImpl1 implements IResetPasswordService {

	@Autowired
	ResetPasswordDAO1 resetPasswordDAO1;
	
	
	@Override
	public String resetPassword(ResetPassword resetPassword) {

		
		String currentEmail= resetPassword.getEmail();
		
		return null;
	}

}
