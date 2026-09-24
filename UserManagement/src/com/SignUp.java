package com;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.util.DBConnection;

public class SignUp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Your New Username");

		String userName = sc.nextLine();

		System.out.println("Enter Your Password");

		String password = sc.nextLine();

		Statement statement = DBConnection.getStatement();

		try {
			statement.executeUpdate(
					"insert into users(user_name,password) values('" + userName + "','" + password + "')");
			
			System.out.println("Congrats you have Signed Up Succesfully..");
		} catch (SQLException ex) {
			System.out.println("UserName already exists..");
		}

	}

}
