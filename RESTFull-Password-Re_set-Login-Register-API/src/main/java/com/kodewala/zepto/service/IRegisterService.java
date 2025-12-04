package com.kodewala.zepto.service;

import org.springframework.stereotype.Service;

import com.kodewala.zepto.bean.UserRegisterBean;



@Service
public interface IRegisterService {

	 String doRegister(UserRegisterBean userRegisterBean  ) ;
		
		
	
}
