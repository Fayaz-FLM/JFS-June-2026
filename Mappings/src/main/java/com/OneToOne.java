package com;

import java.time.LocalDate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.entity.Aadhar;
import com.entity.Citizen;
import com.util.HibernateUtil;

public class OneToOne {
	
	public static void main(String[] args) {
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		session.beginTransaction();
		
//		Aadhar aadhar = new Aadhar(34567, LocalDate.now());
//		
//		Citizen citizen = new Citizen("Rani", 20, aadhar);
//		
//		session.persist(citizen);
		
		Citizen citizen = session.find(Citizen.class, 2);
		
		System.out.println(citizen);
		
		session.getTransaction().commit();
		
		
		
		
	}

}
