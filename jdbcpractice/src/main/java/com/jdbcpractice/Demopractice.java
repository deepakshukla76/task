package com.jdbcpractice;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Demopractice {

	
	public static  void main(String[] args) throws Exception {
	
			Connection connection=null;
		
			
		try {
			
			//step 1 Load driver or Register driver
			Class.forName("org.postgresql.Driver");
			System.out.println("Driver loaded successfully");
			
			//step-2 open connection
			String url ="jdbc:postgresql://localhost:5432/postgres";
			String user ="postgres";
			String password="12345";
			connection=DriverManager.getConnection(url, user, password);
			System.out.println("connection established successfully");
			
			//step 3 create statement
			Statement statement =connection.createStatement();
			String sql="select id,name,cost,rating from product_schema.product order by cost";
		
		//step 4 Execute method
		 ResultSet resultSet = statement.executeQuery(sql);
		 
	    System.out.println("Query executed");
		
		//step 5 process result
		while(resultSet.next()) {

			System.out.print(" Id : "+resultSet.getInt("id"));
			System.out.print(" Product Name : "+resultSet.getString("name"));
			System.out.print(" Product Rating : "+resultSet.getFloat("rating"));
			System.out.println(" Product Cost : "+resultSet.getDouble("cost"));
		
			
		}
		System.out.println("Result Processed successfully");
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		} catch (SQLException e) {
			System.out.println(e);
		}
	
		
		try {
			
		}
		finally {
			try {
				connection.close(); 
				System.out.println("connection closed");}
				catch (Exception e) {
					System.out.println(e);
				}
		}
		}
	
}

		
		
