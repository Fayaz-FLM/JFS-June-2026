package com;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.entity.Department;
import com.entity.Order;
import com.entity.Student;
import com.entity.User;
import com.util.HibernateUtil;

public class OneToMany {
	
	public static void main(String[] args) {
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		Department department = session.find(Department.class, 2);
		
		System.out.println(department);
		
		System.out.println(department.getStudent());
	}

	private static void addStudents(Session session) {
		Student st1 = new Student("Fayaz", 18);
		Student st2 = new Student("Navya", 19);
		Student st3 = new Student("Sai", 29);
		
		List<Student> students = new ArrayList<Student>();
		students.add(st1);
		students.add(st2);
		students.add(st3);
		
		// CSE 
		Department department = session.find(Department.class, 2);
		department.setStudent(students);
		
		st1.setDepartment(department);
		st2.setDepartment(department);
		st3.setDepartment(department);
		
		session.beginTransaction();
		
		session.persist(department);
		
		session.getTransaction().commit();
	}

	private static void addDepartments(Session session) {
		Department dept = new Department("ECE");
		Department dept2 = new Department("CSE");
		Department dept3 = new Department("MECH");
		
		session.beginTransaction();
		
		session.persist(dept);
		session.persist(dept2);
		session.persist(dept3);
		
		session.getTransaction().commit();
	}

	private static void users(Session session) {
		session.beginTransaction();
		
		Order order1 = new Order(2, 10000);
		Order order2 = new Order(1, 5000);
		Order order3 = new Order(10,90000);
		
		List<Order> firstOrdersList = new ArrayList<Order>();
		firstOrdersList.add(order1);
		firstOrdersList.add(order2);
		
		List<Order> secondOrdersList = new ArrayList<Order>();
		secondOrdersList.add(order3);
		
		User user1 = new User("Fayaz", 20, firstOrdersList);
		
		User user2 = new User("Murali", 25, secondOrdersList);
		
		order1.setUser(user1);
		order2.setUser(user1);
		order3.setUser(user2);
		
		session.persist(user1);
		
		session.persist(user2);
		
		session.getTransaction().commit();
		
		System.out.println("Saved USers..");
	}

}
