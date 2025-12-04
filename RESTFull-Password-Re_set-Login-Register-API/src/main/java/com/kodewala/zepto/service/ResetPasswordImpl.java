package com.kodewala.zepto.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kodewala.zepto.bean.ResetPassword;
import com.kodewala.zepto.dao.ResetPasswordDAO;

@Service
public class ResetPasswordImpl implements IResetPasswordService {
	@Autowired
	private ResetPasswordDAO resetPasswordDAO;
	
	@Override
	 public String resetPassword(ResetPassword resetPassword) {
	        return resetPasswordDAO.resetPassword(resetPassword);
	    }

	
}
