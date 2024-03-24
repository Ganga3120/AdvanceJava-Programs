package com.sathya.mysql;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;
public class MyExample1 {


	public static void main(String[] args) throws ClassNotFoundException, SQLException {
     Class.forName("com.mysql.cj.jdbc.Driver");
     Connection connection=DriverManager.getConnection("jdbc:mysql://localhost/ganga","root","root");
     System.out.println("connection created successfully...");
     Statement statement=connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
	 ResultSet set=statement.executeQuery("select*from emp");
	/*		 ((ResultSet) set).afterLast();
	 while(((ResultSet) set).previous())
	 {
		 System.out.println(((ResultSet) set).getInt(1)+" "+((ResultSet) set).getString(2)+" "+((ResultSet) set).getFloat(3));
		 }*/
  //   ((ResultSet) set).first();
	// System.out.println(((ResultSet) set).getInt(1)+" "+((ResultSet) set).getString(2)+" "+((ResultSet) set).getFloat(3));
      ((ResultSet) set).last();
		 System.out.println(((ResultSet) set).getInt(1)+" "+((ResultSet) set).getString(2)+" "+((ResultSet) set).getFloat(3));
       ((ResultSet) set).absolute(2);
		 System.out.println(((ResultSet) set).getInt(1)+" "+((ResultSet) set).getString(2)+" "+((ResultSet) set).getFloat(3));

	}
     
}

