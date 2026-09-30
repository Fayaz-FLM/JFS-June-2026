package com.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Citizen {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int citizenId;
	
	@Column(nullable = false)
	private String name;
	
	private int age;
	
	@JoinColumn(name = "aadhar_id")
	@OneToOne(cascade = CascadeType.ALL)
	private Aadhar aadhar;
	
	public Citizen() {
		
	}
	
	public Citizen(String name, int age, Aadhar aadhar) {
		super();
		this.name = name;
		this.age = age;
		this.aadhar = aadhar;
	}



	public Citizen(int citizenId, String name, int age, Aadhar aadhar) {
		super();
		this.citizenId = citizenId;
		this.name = name;
		this.age = age;
		this.aadhar = aadhar;
	}



	public int getCitizenId() {
		return citizenId;
	}

	public void setCitizenId(int citizenId) {
		this.citizenId = citizenId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Aadhar getAadhar() {
		return aadhar;
	}

	public void setAadhar(Aadhar aadhar) {
		this.aadhar = aadhar;
	}

	@Override
	public String toString() {
		return "Citizen [citizenId=" + citizenId + ", name=" + name + ", age=" + age + ", aadhar=" + aadhar + "]";
	}
	
}
