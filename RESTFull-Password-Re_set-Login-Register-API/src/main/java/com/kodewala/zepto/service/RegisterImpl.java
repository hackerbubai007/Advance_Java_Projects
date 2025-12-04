package com.kodewala.zepto.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kodewala.zepto.bean.UserRegisterBean;
import com.kodewala.zepto.dao.RegisterDAO;
import com.kodewala.zepto.entity.UserRegisterEntity;

@Service
public class RegisterImpl implements IRegisterService {

	@Autowired
	RegisterDAO registerDAO;

	@Override
	public String doRegister(UserRegisterBean userRegisterBean) {
		
		
		UserRegisterEntity userRegisterEntity= new UserRegisterEntity();
		
		userRegisterEntity.setFirstName(userRegisterBean.getFirstName());
		userRegisterEntity.setLastName(userRegisterBean.getLastName());
		userRegisterEntity.setPhNo(userRegisterBean.getPhNo());
		userRegisterEntity.setEmail(userRegisterBean.getEmail());
		userRegisterEntity.setPassword(userRegisterBean.getPassword());
		
		
		String userId = registerDAO.register(userRegisterEntity);

		return userId;
	}

}
