package com.sathya.mysql;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.*;
public class Mysqlconnection {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
     //load the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost/ganga","root","root");
		System.out.println("connection created succesfully...");
		PreparedStatement preparedstatement=connection.prepareStatement("insert into emp values(?,?,?)");
		  preparedstatement.setInt(1,101);
		  preparedstatement.setString(2,"Mahesh");
		  preparedstatement.setFloat(3,100000.0f);
		  preparedstatement.addBatch();
		  preparedstatement.setInt(1,102);
		  preparedstatement.setString(2,"Sithara");
		  preparedstatement.setFloat(3,10000.0f);
		  preparedstatement.addBatch();
	     preparedstatement.setInt(1,103);
	     preparedstatement.setString(2,"Prince");
		 preparedstatement.setFloat(3,30000.0f);
		  preparedstatement.addBatch();
	     preparedstatement.executeBatch();
	     System.out.println("Data inserted successfully...");
	}
}