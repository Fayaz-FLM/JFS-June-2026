package com.constants;

public class DbConstants {
	
	public static final String DB_URL = "jdbc:mysql://localhost:3306/jdbc";
	public static final String DB_USER_NAME = "root";
	public static final String DB_PASSWORD = "Fayaz78677@";
	
	public static final String INSERT_QUERY = "insert into students values(4,'Fayaz',30)";
	public static final String UPDATE_QUERY = "update students set marks = 35 where id= 4";
	public static final String DELETE_QUERY = "delete from students where id = 4";

}
