package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.entity.Employee;
import com.entity.Students;
import com.util.HibernateUtil;

public class DMLOperations {
	
	public static void main(String[] args) {
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		Employee emp = new Employee("Phani", 20000);
		
		session.beginTransaction();
		
		session.persist(emp);
		
		session.getTransaction().commit();
	}

	private static void update(Session session) {
		Students st = session.find(Students.class, 2);
		st.setMarks(97);
		
		session.beginTransaction();
		
		session.merge(st);
		
		session.getTransaction().commit();
	}

	private static void delete(Session session) {
		Students st = new Students(4, "",0);
		
		session.beginTransaction();
		session.remove(st);
		session.getTransaction().commit();
	}

	private static void select(Session session) {
		Students st1 = session.find(Students.class, 2);
		
		System.out.println(st1);
	}

	private static void insert(Session session) {
		Students st1 = new Students(4, "Navya", 99);
		
		session.beginTransaction();
		
		session.persist(st1);
		
		session.getTransaction().commit();
	}
}
