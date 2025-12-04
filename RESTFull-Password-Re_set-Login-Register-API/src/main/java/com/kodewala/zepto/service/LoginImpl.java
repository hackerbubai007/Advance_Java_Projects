package com.kodewala.zepto.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kodewala.zepto.bean.LoginBean;
import com.kodewala.zepto.dao.LoginDAO;

@Service
public class LoginImpl implements ILoginService {

	@Autowired
	LoginDAO loginDAO;

	@Override
	public String Login(LoginBean loginBean) {

		return loginDAO.login(loginBean);
	}

}
