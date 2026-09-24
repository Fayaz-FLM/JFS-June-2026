package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.constants.DbConstants;

public class DbConnection {
	
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
	
}
