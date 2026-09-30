package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.entity.Employee;
import com.util.HibernateUtil;

public class DMLOperation {
	
	public static void main(String[] args) {
		
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		// Persistant state 
		Employee employee = session.find(Employee.class, 1);
		
		// Transient state 
		Employee emp1 = new Employee("Fayaz", 10000);
		
		session.beginTransaction();
		
		//emp1 - persistent
		session.persist(emp1);
		
		employee.setEmployeeName("Rani");
		employee.setEmployeeSalary(29000);
		
		emp1.setEmployeeSalary(31000);
		
		session.getTransaction().commit();
		
		session.close();
		
		// Detached state 
		employee.setEmployeeSalary(50000);
		emp1.setEmployeeSalary(70000);
		
		System.out.println("Updated Employee...");
	}

}
