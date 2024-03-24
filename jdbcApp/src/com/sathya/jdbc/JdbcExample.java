package com.sathya.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;
public class JdbcExample {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		//step1 to load the driver
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("Driver Loaded successfully");
		
		//step2 create the connection
		Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","ganga","bhavani");
		System.out.println("Connection created successfully");
		//step 3 process the static query
		  Statement statement=connection.createStatement();
		  String q1="create table emp1(empid number,empname varchar2(20),empsalary number)";
		  		int res1=statement.executeUpdate(q1);
		  System.out.println("table created successfully......."+res1);
//		  String q2="drop table emp1";
//		  int res2=statement.executeUpdate(q2);
//		  System.out.println("table dropped successfully......"+res2);
		  //step 4 release the connection
		  connection.close();
		  System.out.println("connection is closed.......");
	}
	} 

