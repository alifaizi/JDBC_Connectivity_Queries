package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class SQLConnectionSetup {
	
	// This class holds the connectivity with the mySQL database and complete CRUD queries.

	public static void main(String[] args) throws SQLException{
		
		Connection myConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/xai", "root", "jaf@SQL22!");
	
		// Statement is for executing our query into the database
		Statement myStatement = myConnection.createStatement();
		
		// Insert Query
		
		String insertQuery = "INSERT INTO xai.student (id, firstName, lastName, age) VALUES ('6', 'Mike', 'JOnes', '32')"; 

		myStatement.execute(insertQuery);
	
		System.out.println("Records added into the database");	
		
		// Close the resources
		
		myStatement.close();
		myConnection.close();
		
	}

}
