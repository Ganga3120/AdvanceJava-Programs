package com.sathya.jdbc;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;
import java.util.*;
public class Functiondemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
     Class.forName("oracle.jdbc.driver.OracleDriver");
      Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","ganga","bhavani");
         CallableStatement callablestatement=connection.prepareCall("{?=call getAvg(?,?)");
         callablestatement.setInt(2,1001);
         callablestatement.setInt(3,1002);
         callablestatement.registerOutParameter(1,Types.FLOAT);
         callablestatement.executeUpdate();
         System.out.println(callablestatement.getFloat(1));
	
          connection.close();
	}
}

