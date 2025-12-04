package com.kodewala.zepto.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kodewala.zepto.bean.LoginBean;
import com.kodewala.zepto.entity.UserRegisterEntity;

@Repository
public class LoginDAO {

    @Autowired
    SessionFactory sessionFactory;

    public String login(LoginBean loginBean) {

        Session session = sessionFactory.openSession();

        try {
            String email = loginBean.getEmail();
            String password = loginBean.getPassword();

            // Step 1: Fetch User by Email
            String hql = "FROM UserRegisterEntity u WHERE u.email = :email";
            UserRegisterEntity user = (UserRegisterEntity) session.createQuery(hql)
                    .setParameter("email", email)
                    .uniqueResult();

            if (user == null) {
                return "Email not found!";
            }

            // Step 2: Validate Password
            if (!user.getPassword().equals(password)) {
                return "Invalid password!";
            }

            // Step 3: Login Success
            return "Login successful! Welcome " + user.getFirstName();

        } catch (Exception e) {
            e.printStackTrace();
            return "Error during login!";
        } finally {
            session.close();
        }
    }
}
