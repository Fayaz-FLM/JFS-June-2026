package com.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Aadhar {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int aadharId;
	
	@Column(unique = true)
	private int aadharNumber;
	
	private LocalDate issuedAt;
	
	public Aadhar() {
		
	}

	public Aadhar(int aadharId, int aadharNumber, LocalDate issuedAt) {
		this.aadharId = aadharId;
		this.aadharNumber = aadharNumber;
		this.issuedAt = issuedAt;
	}

	public Aadhar(int aadharNumber, LocalDate issuedAt) {
		this.aadharNumber = aadharNumber;
		this.issuedAt = issuedAt;
	}

	public int getAadharId() {
		return aadharId;
	}

	public void setAadharId(int aadharId) {
		this.aadharId = aadharId;
	}

	public int getAadharNumber() {
		return aadharNumber;
	}

	public void setAadharNumber(int aadharNumber) {
		this.aadharNumber = aadharNumber;
	}

	public LocalDate getIssuedAt() {
		return issuedAt;
	}

	public void setIssuedAt(LocalDate issuedAt) {
		this.issuedAt = issuedAt;
	}

	@Override
	public String toString() {
		return "Aadhar [aadharId=" + aadharId + ", aadharNumber=" + aadharNumber + ", issuedAt=" + issuedAt + "]";
	}

	
}
