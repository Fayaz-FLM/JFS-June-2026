package com;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.util.DbConnection;

public class BatchOperation {
	
	public static void main(String[] args) throws SQLException {
		
		Connection connection = DbConnection.createConnection();
		
		PreparedStatement ps = connection.prepareStatement("Insert into students values(?,?,?)");
		
		ps.setInt(1, 4);
		ps.setString(2, "Murali");
		ps.setInt(3, 99);
		
		ps.addBatch();
		
		ps.setInt(1, 5);
		ps.setString(2, "Gowri");
		ps.setInt(3, 98);
		
		ps.addBatch();
		
		ps.setInt(1, 6);
		ps.setString(2, "Teja");
		ps.setInt(3, 100);
		
		ps.addBatch();
		
		ps.executeBatch();
		System.out.println("Inserted 3 rows...");
	}

}
