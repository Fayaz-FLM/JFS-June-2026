package com;

public class BankAccount {
	
	private long accountNum;
	
	private String userName;
	
	private String ifscCode;
	
	private String branch;
	
	private double balance;
	
	public long getAccountNum() {
		return this.accountNum;
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	public void setBalance(double balance) {
		if(balance >= 0) {
			this.balance = balance;
		}
		else {
			System.out.println("Invalid Balance... Balance cannot be Negative..");
		}
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public BankAccount() {
		
	}

	public BankAccount(long accountNum, String userName, String ifscCode, String branch, double balance) {
		this.accountNum = accountNum;
		this.userName = userName;
		this.ifscCode = ifscCode;
		this.branch = branch;
		this.balance = balance;
	}
	
	

}
