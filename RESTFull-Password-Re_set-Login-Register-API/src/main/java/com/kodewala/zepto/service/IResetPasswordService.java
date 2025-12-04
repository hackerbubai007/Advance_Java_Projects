package com.kodewala.zepto.service;

import org.springframework.stereotype.Service;

import com.kodewala.zepto.bean.ResetPassword;

@Service
public interface IResetPasswordService {

	
	 String resetPassword(ResetPassword resetPassword);
}
