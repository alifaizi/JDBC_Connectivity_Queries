package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateRecord {

	public static void main(String[] args) throws SQLException{
		
		Connection myConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/xai", "root", "jaf@SQL22!");
		
		Statement myStatement = myConnection.createStatement();
		
		// Insert Query
		
		String insertRecord = "INSERT INTO xai.student (id, firstName, lastName, age) VALUES ('6', 'Scott', 'Jones', '56')";
		
		myStatement.execute(insertRecord);
		
		System.out.println("Record has been added successfully!");
		
	}

}
