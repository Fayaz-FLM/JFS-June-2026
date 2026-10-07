package com;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.entity.Course;
import com.entity.Student;
import com.util.HibernateUtil;

public class ManyToMany {
	
	public static void main(String[] args) {
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		Course course = session.find(Course.class, 1);
		
		System.out.println(course);
		System.out.println(course.getStudents());
		
	}

	private static void saveStudents(Session session) {
		session.beginTransaction();
		
		Student st1 = new Student("Rushitha", 20);
		Student st2 = new Student("Murali", 23);
		
		List<Student> students1 = new ArrayList<>();
		students1.add(st1);
		students1.add(st2);
		
		Course course = session.find(Course.class, 1);
		
		List<Course> coursesList = new ArrayList<>();
		coursesList.add(course);
		
		course.setStudents(students1);
		
		st1.setCourses(coursesList);
		st2.setCourses(coursesList);
		
		session.persist(course);
		
		session.getTransaction().commit();
	}

	private static void addCourses(Session session) {
		session.beginTransaction();
		
		Course course1 = new Course("JFS", 10000);
		Course course2 = new Course("Cyber Security", 7000);
		
		session.persist(course1);
		
		session.persist(course2);
		
		session.getTransaction().commit();
	}

}
