package com.sathya.jdbc;
import java.sql.CallableStatement;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;
import java.util.*;
public class ProcedureDemo
{

	public static Connection createConnection() throws ClassNotFoundException, SQLException
	{
      Class.forName("oracle.jdbc.driver.OracleDriver");
      Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","ganga","bhavani");
      CallableStatement callablestatement=connection.prepareCall("{call getSal(?,?)}");
         callablestatement.setInt(1,1001);
         callablestatement.registerOutParameter(2,Types.DOUBLE);
         callablestatement.executeUpdate();
         System.out.println(callablestatement.getDouble(2));
         connection.close();
		return connection;
	}

}
