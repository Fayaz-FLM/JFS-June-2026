package com;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.util.DBConnection;

public class Login2 {
	
	public static void main(String[] args) throws SQLException {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Your New Username");

		String userName = sc.nextLine();

		System.out.println("Enter Your Password");

		String password = sc.nextLine();

		Connection connection = DBConnection.createConnection();
		
		
		PreparedStatement preparedStatement = connection.prepareStatement("select * from users where user_name = ? and password = ?");
		
		preparedStatement.setString(1, userName);
		preparedStatement.setString(2, password);
		
		ResultSet rs = preparedStatement.executeQuery();
		
		if(rs.next()) {
			System.out.println("Logged In");
		}else {
			System.out.println("Invalid credentials..");
		}
	}

}
