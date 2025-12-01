package com.kodewala.config;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.hibernate.cfg.Configuration;

public class HibernateConfiguration {

	public Session hibernateConfiguration() {

		Configuration cfg = new Configuration();

		cfg.configure("\\com\\kodewala\\config\\hibernate-cfg.xml");

		SessionFactory sessionFactory = cfg.buildSessionFactory();

		Session session = sessionFactory.openSession();

		return session;

	}

}
