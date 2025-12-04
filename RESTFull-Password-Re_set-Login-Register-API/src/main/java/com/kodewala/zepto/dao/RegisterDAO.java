package com.kodewala.zepto.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kodewala.zepto.entity.PasswordLogEntity;
import com.kodewala.zepto.entity.UserRegisterEntity;

@Repository
public class RegisterDAO {

	@Autowired
	SessionFactory sessionFactory;

	public String register(UserRegisterEntity userRegisterEntity) {

		Session session = sessionFactory.openSession();
		Transaction txn = session.beginTransaction();

		try {
			// Check if email already exists
			String hql = "SELECT 1 FROM UserRegisterEntity u WHERE u.email = :email";
			Object emailExists = session.createQuery(hql).setParameter("email", userRegisterEntity.getEmail())
					.uniqueResult();

			if (emailExists != null) {
				return "Email already exists!";
			}

			// Save User
			Integer userId = (Integer) session.save(userRegisterEntity);

			// Create PasswordLog entry
			PasswordLogEntity passwordLogEntity = new PasswordLogEntity();
			passwordLogEntity.setUserId(userId);
			passwordLogEntity.setCurrentPassword(userRegisterEntity.getPassword());

			session.save(passwordLogEntity);

			txn.commit();
			return "User registered successfully! ID: " + userId;

		} catch (Exception e) {
			txn.rollback();
			e.printStackTrace();
			return "Error while registering user.";
		} finally {
			session.close();
		}
	}
}
