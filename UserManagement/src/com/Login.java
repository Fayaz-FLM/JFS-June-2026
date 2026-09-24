package com;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.util.DBConnection;

public class Login {
	
	public static void main(String[] args) throws SQLException {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Your New Username");

		String userName = sc.nextLine();

		System.out.println("Enter Your Password");

		String password = sc.nextLine();

		Statement statement = DBConnection.getStatement();
		
		ResultSet rs = statement.executeQuery("select * from users where user_name = '" + userName +"' and password = '"+ password +"'");
		
		if(rs.next()) {
			System.out.println("Logged In");
		}else {
			System.out.println("Invalid credentials..");
		}
	}

}
