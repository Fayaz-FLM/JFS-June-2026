package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "orders")
public class Order {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int orderId;
	
	private int quantity;
	
	private int price;
	
	@JoinColumn(name = "user_id")
	@ManyToOne
	private User user;
	
	public Order() {
		
	}
	
	public Order(int quantity, int price) {
		super();
		this.quantity = quantity;
		this.price = price;
	}

	public Order(int quantity, int price, User user) {
		super();
		this.quantity = quantity;
		this.price = price;
		this.user = user;
	}

	public Order(int orderId, int quantity, int price, User user) {
		super();
		this.orderId = orderId;
		this.quantity = quantity;
		this.price = price;
		this.user = user;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", quantity=" + quantity + ", price=" + price + "]";
	}
	
}
