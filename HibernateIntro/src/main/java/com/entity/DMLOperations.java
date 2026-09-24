package com.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DMLOperations {
	
	public static void main(String[] args) {
		
		// Configuration
		
		Configuration cfg = new Configuration();
		
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Students.class);
		
		// Session Factory
		
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		
		// Session
		
		Session session = sessionFactory.openSession();
		
		session.beginTransaction();
		
		Students st1 = new Students(3, "Rohan", 94);
		
		session.persist(st1); // insert
		
		session.getTransaction().commit();
	}
}
