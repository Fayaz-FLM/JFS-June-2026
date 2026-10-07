package com.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id")
	private int userId;
	
	@Column(unique = true)
	private String userName;
	
	private int age;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
	private List<Order> orders;
	
	public User() {
		
	}
	
	public User(String userName, int age) {
		super();
		this.userName = userName;
		this.age = age;
	}



	public User(String userName, int age, List<Order> orders) {
		super();
		this.userName = userName;
		this.age = age;
		this.orders = orders;
	}



	public User(int userId, String userName, int age, List<Order> orders) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.age = age;
		this.orders = orders;
	}



	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", age=" + age + "]";
	}
	
	
}
