package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class SQLConnection {

	public static void main(String[] args) throws SQLException{
		
		Connection myConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/xai", "root", "jaf@SQL22!");
		
		// We need a CRUD statement 
	
		// Statement is for executing our query into the database
		Statement myStatement = myConnection.createStatement();
		
		// Insert Query
		
//		String insertQuery = "INSERT INTO xai.student (id, firstName, lastName, age) VALUES ('6', 'Mike', 'JOnes', '32')"; 
//		
//		myStatement.execute(insertQuery);
//		
//		System.out.println("Records added into the database");
		
		
		// Update Query
		
//		String updateQuery = "UPDATE student SET firstName = 'Sarah' WHERE id = 2";
//		myStatement.execute(updateQuery);
//		System.out.println("The first name of the student with id number 2 is updated");

		
		// Delete Query
		
//		String deletQuery = "DELETE from student where id = 6";
//		myStatement.execute(deletQuery);
//		System.out.println("The record with ID number 6 is deleted.");

		
		// Select Query
		
		String selectQuery = "select id, firstName, lastName, age from student";
		
		ResultSet myResult = myStatement.executeQuery(selectQuery);
		
		while (myResult.next()) {
			
			int myId = myResult.getInt("id");
			String myFirstName = myResult.getString("firstName");
			String myLastName = myResult.getString("lastName");
			String myAge = myResult.getString("age");
			
			System.out.println("Id: " + myId + " First Name: " + myFirstName + " Last Name: " + myLastName + " Age: " + myAge);	
			
		}
		
		
	}

}
