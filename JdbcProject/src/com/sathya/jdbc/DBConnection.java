package com.sathya.jdbc;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.*;
public class DBConnection {

	public static Connection createConnection() throws ClassNotFoundException, SQLException
	{
     Class.forName("oracle.jdbc.driver.OracleDriver");
     Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","ganga","bhavani");
    System.out.println("connection created succesfully");
	return connection;
    
     
	}

}
