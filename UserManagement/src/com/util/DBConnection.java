package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.constants.DbConstants;

public class DBConnection {
	
	
	public static Connection createConnection() {
		
		Connection connection = null;
		
		try {
			connection = DriverManager.getConnection(DbConstants.DB_URL,
					DbConstants.DB_USER_NAME,DbConstants.DB_PASSWORD);
		}
		catch(SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return connection;
		
	}
	
	public static Statement getStatement() {
		
		Connection connection = createConnection();
		Statement statement = null;
		try {
			
			statement = connection.createStatement();
		}
		catch(SQLException ex) {
			System.out.println(ex.getMessage());
		}
		
		return statement;
	}

}
