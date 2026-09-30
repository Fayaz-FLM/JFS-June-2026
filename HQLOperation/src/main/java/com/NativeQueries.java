package com;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.MutationQuery;
import org.hibernate.query.NativeQuery;

import com.entity.Product;
import com.util.HibernateUtil;

public class NativeQueries {
	
	public static void main(String[] args) {
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		MutationQuery nativeMutationQuery = session.createNativeMutationQuery("insert into products(name,quantity,price) values(?1,?2,?3)");
		
		session.beginTransaction();
		
		nativeMutationQuery.setParameter(1, "Mobile");
		nativeMutationQuery.setParameter(2, 2);
		nativeMutationQuery.setParameter(3, 30000);
		
		nativeMutationQuery.executeUpdate();
		
		session.getTransaction().commit();
	}

	private static void selectById(Session session) {
		NativeQuery<Product> nativeQuery = session.createNativeQuery("Select * from products where id = ?1", Product.class);
		
		nativeQuery.setParameter(1, 3);
		
		List<Product> list = nativeQuery.list();
		
		System.out.println(list);
	}

	private static void selectALl(Session session) {
		NativeQuery<Product> nativeQuery = session.createNativeQuery("Select * from products", Product.class);
		
		List<Product> list = nativeQuery.list();
		
		System.out.println(list);
	}

}
