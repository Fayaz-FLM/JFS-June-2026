package com.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.entity.Aadhar;
import com.entity.Citizen;
import com.entity.Department;
import com.entity.Order;
import com.entity.Student;
import com.entity.User;

public class HibernateUtil {
	
	private static SessionFactory sessionFactory = null;
	
	public static SessionFactory getSessionFactory() {
		
		if(sessionFactory == null) {
			Configuration cfg = new Configuration();
			cfg.configure("hibernate.cfg.xml");
			cfg.addAnnotatedClass(Citizen.class);
			cfg.addAnnotatedClass(Aadhar.class);
			cfg.addAnnotatedClass(Order.class);
			cfg.addAnnotatedClass(User.class);
			cfg.addAnnotatedClass(Department.class);
			cfg.addAnnotatedClass(Student.class);
			
			
			sessionFactory = cfg.buildSessionFactory();
			return sessionFactory;
		}
		else {
			return sessionFactory;
		}
		
		
	}

}
