package com.kodewala.zepto.service;

import org.springframework.stereotype.Service;

import com.kodewala.zepto.bean.LoginBean;

@Service
public interface ILoginService {
	
	public String Login(LoginBean loginBean);

}
