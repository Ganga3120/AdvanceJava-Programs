package com.sathya.mysql;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.*;
public class Myexample2 {
	public static void main(String args[]) throws ClassNotFoundException, SQLException
	{	
  Class.forName("com.mysql.cj.jdbc.Driver");
  Connection connection=DriverManager.getConnection("jdbc:mysql://localhost/ganga","root","root");
  System.out.println("connection creates successfull..");
  Statement statement=(Statement) connection.createStatement();
    ResultSet set=((java.sql.Statement) statement).executeQuery("select*from emp");
      ResultSetMetaData metadata=set.getMetaData();
     // System.out.println(metadata.getCatalogName(2));
      System.out.println(metadata.getColumnName(2));
      System.out.println(metadata.getColumnTypeName(1));
      System.out.println(metadata.getColumnCount());
      System.out.println(metadata.getColumnDisplaySize(2));
       connection.close();

}
}
