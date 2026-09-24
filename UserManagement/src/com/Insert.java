package com;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.util.DBConnection;

public class Insert {
	
	public static void main(String[] args) throws SQLException {
		
		Connection connection = DBConnection.createConnection();
		
		PreparedStatement preparedStatement = connection.prepareStatement("Insert into users values(?,?,?)");
		
		preparedStatement.setInt(1, 4);
		preparedStatement.setString(2, "myLifeMyRules");
		preparedStatement.setString(3, "NoPassword");
		
		preparedStatement.executeUpdate();
		
		System.out.println("Inserted");
		
		
		
	}
}
