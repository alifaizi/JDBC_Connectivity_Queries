package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class RetrieveRecord {

	public static void main(String[] args) throws SQLException{
		
		Connection myConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/xai", "root", "jaf@SQL22!");
		
		Statement myStatement = myConnection.createStatement();
		
		// Retrieve the records
		
		String retriveRecord = "SELECT * FROM xai.student";
		
		ResultSet result = myStatement.executeQuery(retriveRecord);
		
		while (result.next()) {
			int id = result.getInt("id");
			String firstName = result.getString("firstName");
			String lastName = result.getString("lastName");
			String age = result.getString("age");
			
			System.out.println("Id: " + id + " " + "First Name: " + firstName + " " + "Last Name: " + lastName + " " + "Age: " + age );
			
		}
		
		// Close the resources
		
		result.close();
		myStatement.close();
		myConnection.close();
		
	}

}
