package com;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import com.util.DBConnection;

public class Test {
	
	public static void main(String[] args) throws SQLException {
		
		
		Statement statement = DBConnection.getStatement();
		
		ResultSet rs = statement.executeQuery("Select * from students");
		
		
		
		// Meta Data... 
		
		ResultSetMetaData metaData = rs.getMetaData();
		
//		System.out.println("columns : " +metaData.getColumnCount());
//		System.out.println(metaData.getColumnName(1));
//		System.out.println(metaData.getColumnTypeName(1));
//		System.out.println(metaData.getColumnTypeName(2));
//		System.out.println(metaData.getTableName(1));
		
		System.out.println(metaData.getColumnName(1) + "  " +metaData.getColumnName(2)
							+ "  " + metaData.getColumnName(3));
		
		while(rs.next()) {
			
			System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  "+ rs.getInt(3));
			
		}
		
		
	}

}
