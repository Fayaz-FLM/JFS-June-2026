package com;

public class Transactions {
	
	public static void main(String[] args) {
		
		BankAccount bankAcc1 = new BankAccount(1234, "Fayaz", "FBIN120", "Hyderabad", 19);
		
		bankAcc1.setBalance(99);
		
		double balance = bankAcc1.getBalance();
		System.out.println(balance);
		
		bankAcc1.setBalance(1099);
		balance = bankAcc1.getBalance();
		System.out.println(balance);
		
		bankAcc1.setBalance(-2000);
		balance = bankAcc1.getBalance();
		System.out.println(balance);
	}

}
