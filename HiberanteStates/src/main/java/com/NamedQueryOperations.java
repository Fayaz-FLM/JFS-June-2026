package com;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.entity.Employee;
import com.util.HibernateUtil;

public class NamedQueryOperations {
	
	public static void main(String[] args) {
		
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		
		Session session = sessionFactory.openSession();
		
//		Query<Employee> namedQuery = session.createNamedQuery("allemployees",Employee.class);
//		
//		List<Employee> list = namedQuery.list();
//		
//		System.out.println(list);
		
		Query<Employee> namedQuery = session.createNamedQuery("singleemp", Employee.class);
		
		namedQuery.setParameter(1, 3);
		
		List<Employee> list = namedQuery.list();
		
		System.out.println(list);
	}

}
