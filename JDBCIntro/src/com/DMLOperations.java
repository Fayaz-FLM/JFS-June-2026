package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DMLOperations {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		// Register a Driver 
		System.out.println("Starting to Register a Driver");
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		System.out.println("Driver registered");
		
		// Establish Connection
		
		String url = "jdbc:mysql://localhost:3306/jdbc";
		String userName = "root";
		String password = "Fayaz78677@";
		
		Connection connection = DriverManager.getConnection(url, userName, password);
		
		System.out.println("Connection Established...");
		
		
		// Prepare a sql query 
		
		String insertQuery = "insert into students values(3,'Hari',96)";
		
		// create a statement
		
	 	Statement statement = connection.createStatement();
	 	
	 	// execute statement
	 	
	 	statement.executeUpdate(insertQuery);
	 	
	 	System.out.println("Inserted Data....");

	 	// close the resources
	 	
	 	connection.close();
	 	statement.close();
	 	
	 	
	}
}
