package com.sathya.jdbc;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.*;
public class BatchProcessing {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
   Class.forName("oracle.jdbc.driver.OracleDriver");
   Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","ganga","bhavani");
     Statement statement=connection.createStatement();
     statement.addBatch("create table stu(id number,name varchar2(20))");
     statement.addBatch("insert into stu values(11,'ganga')");
     statement.addBatch("insert into stu values(12,'manga')");
     statement.addBatch("delete from stu where id=11");
     statement.addBatch("drop table stu");
     int list[]= statement.executeBatch();
     for(int results:list)
    	 System.out.println(results);
     connection.close();
     
	}
}