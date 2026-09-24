package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateOperation {
	
	
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url = "jdbc:mysql://localhost:3306/jdbc";
		String userName = "root";
		String password = "Fayaz78677@";
		
		Connection connection = DriverManager.getConnection(url, userName, password);
		
		String query = "update students set marks = 100 where id = 3";
		String query2 = "Delete from students where id = 2";
		
		Statement statement = connection.createStatement();
		
		statement.executeUpdate(query);
		System.out.println("Updated ....");

		statement.executeUpdate(query2);
	
		System.out.println("Deleted...");
		
		connection.close();
		statement.close();
		
		
	}

}
