package com.sathya.servlet;
import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.*;
public class Myexample3 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		  Class.forName("com.mysql.cj.jdbc.Driver");
     Connection connection=DriverManager.getConnection("jdbc:mysql://localhost/ganga","root","root");
     System.out.println("connection created successfully..");
    
	}
}