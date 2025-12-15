package com.kodewala.zepto.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

import com.kodewala.zepto.bean.ResetPassword;

public class ResetPasswordDAO1 {
	
	@Autowired
	SessionFactory sessionFactory;
	
	Session session= sessionFactory.openSession();
	
	Transaction txn =session.beginTransaction();
	
	ResetPassword resetPassword;
	
	
	public void fetchUserId() {
		
		
	}
	
	

}
