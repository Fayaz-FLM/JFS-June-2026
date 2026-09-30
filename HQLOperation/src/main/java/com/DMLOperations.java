package com;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.MutationQuery;
import org.hibernate.query.SelectionQuery;

import com.entity.Product;
import com.util.HibernateUtil;

public class DMLOperations {
	
	public static void main(String[] args) {
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		delete(session);
		
	}

	private static void delete(Session session) {
		session.beginTransaction();
		
		MutationQuery mutationQuery = session.createMutationQuery("Delete From Product where id = :id");
		
		mutationQuery.setParameter("id", 4);
		
		mutationQuery.executeUpdate();
		
		
		session.getTransaction().commit();
	}

	private static void update(Session session) {
		session.beginTransaction();
		
		MutationQuery mutationQuery = session.createMutationQuery("update Product set quantity = :quantity where id = :id");
		
		mutationQuery.setParameter("quantity", 10);
		mutationQuery.setParameter("id", 3);
		
		mutationQuery.executeUpdate();
		
		session.getTransaction().commit();
	}

	private static void insert(Session session) {
		session.beginTransaction();
		
		MutationQuery mutationQuery = session.createMutationQuery("Insert Into Product(name,quantity,price) values(?1,?2,?3)");
		
		mutationQuery.setParameter(1, "AC");
		mutationQuery.setParameter(2, 1);
		mutationQuery.setParameter(3, 1000);
		
		mutationQuery.executeUpdate();
		
		session.getTransaction().commit();
	}

	private static void select(Session session) {
		SelectionQuery<Product> selectionQuery = session.createSelectionQuery("From Product where productId = ?1",Product.class);
		
		selectionQuery.setParameter(1, 3);
		
		List<Product> list = selectionQuery.list();
		
		System.out.println(list);
	}

	private static void selectAll(Session session) {
		SelectionQuery<Product> selectionQuery = session.createSelectionQuery("From Product",Product.class);
		
		List<Product> list = selectionQuery.list();
		
		System.out.println(list);
	}

}
