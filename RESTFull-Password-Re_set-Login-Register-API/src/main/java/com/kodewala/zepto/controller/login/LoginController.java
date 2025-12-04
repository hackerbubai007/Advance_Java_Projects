package com.kodewala.zepto.controller.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kodewala.zepto.bean.LoginBean;
import com.kodewala.zepto.service.LoginImpl;

@RestController
public class LoginController {

	@Autowired
	LoginImpl loginImpl;

	@PostMapping("login")
	public String login(@RequestBody LoginBean loginBean) {

		return loginImpl.Login(loginBean);

	}

}
