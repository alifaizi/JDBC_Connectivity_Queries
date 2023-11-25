package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateRecords {

	public static void main(String[] args) throws SQLException{
		
		Connection myConnection = DriverManager.getConnection("JDBC:mysql://localhost:3306/xai", "root", "jaf@SQL22!");
		
		Statement myStatement = myConnection.createStatement();
		
		// Update the Records
		
		String updateRecord = "UPDATE xai.student SET lastName = 'Amadori' WHERE id = '2'";
		
		myStatement.execute(updateRecord);
		
		System.out.println("The Recrod with ID number 2 has been updated successfully!");
		
		// Close Connection
		
		myConnection.close();
		myStatement.close();

	}

}
