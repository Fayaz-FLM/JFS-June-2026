package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.entity.Car;
import com.entity.CarId;
import com.util.HibernateUtil;

public class CompositeKeys {
	
	public static void main(String[] args) {
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		session.beginTransaction();
		
		CarId carId = new CarId(123, 459);
		Car car = new Car(carId, "Altroz", "Tata", 900000);
		
		session.persist(car);
		
		session.getTransaction().commit();
		
	}
}
