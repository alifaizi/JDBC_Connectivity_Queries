package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteRecord {

	public static void main(String[] args) throws SQLException {

		Connection myConnection = DriverManager.getConnection("JDBC:mysql://localhost:3306/xai", "root", "jaf@SQL22!");

		Statement myStatement = myConnection.createStatement();

		// Delete records

		String deletRecord = "DELETE from xai.student WHERE id = 6";

		myStatement.execute(deletRecord);

		System.out.println("Record has been deleted successfully!");
		
		// Close Connection

		myConnection.close();
		myStatement.close();

	}

}
