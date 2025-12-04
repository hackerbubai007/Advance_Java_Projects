package com.kodewala.zepto.controller.register;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kodewala.zepto.bean.UserRegisterBean;
import com.kodewala.zepto.service.RegisterImpl;

@RestController
public class ResgisterController {
	
	@Autowired
	RegisterImpl registerImpl;
	
	
	@PostMapping("register")
	public String register(@RequestBody UserRegisterBean userRegisterBean) {
		
		
		String userId=registerImpl.doRegister(userRegisterBean);
		
		return userId;
		
	}

}
