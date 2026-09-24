package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SingleRow {
	
	public static void main(String[] args) throws SQLException {
		
		String url = "jdbc:mysql://localhost:3306/jdbc";
		String userName = "root";
		String password = "Fayaz78677@";
		
		Connection conn = DriverManager.getConnection(url, userName, password);
		
		String query = "Select * from students";
		
		Statement statement = conn.createStatement();
		
		ResultSet rs = statement.executeQuery(query);
		
		for(int i=1; i<=3 ; i++) {
			
			rs.next();
			
			int id = rs.getInt("id");
			String name = rs.getString("name");
			int marks = rs.getInt("marks");
			
			System.out.print(id + "	" + name + "	" + marks);
			System.out.println();
			
		}
		
		
		
	}

}
