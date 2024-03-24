package com.sathya.jdbc;


import java.sql.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import oracle.net.jdbc.TNSAddress.SOException;

public class EmployeeDao {
    public int save(Employee emp) throws SQLException
    {
    	Connection connection=null;
    	PreparedStatement preparedstatement=null;
    	int count=0;
    	try
    	{
    		//get the connection
    		connection=DBConnection.createconnection();
    		//cretae ps object
    		preparedstatement=connection.prepareStatement("insert into emp1 values(?,?,?)");
    		//read the data from emp object and set to parameters
    		preparedstatement.setInt(1, emp.getEmpid());
    		preparedstatement.setString(2,emp.getEmpname());
    		preparedstatement.setDouble(3,emp.getEmpsalary());
    		count=preparedstatement.executeUpdate();

    	}
    	catch(SQLException e)
    	{
    		e.printStackTrace();
    	}
    	finally
    	{
    		//before release connection check the connection is present or not
    		if(connection!=null)
    			connection.close();
    		  if(preparedstatement!=null)
    			  preparedstatement.close();
    	}
    	return count;
    }
   public Employee findbyId(int empid)
{
	Employee employee=null;
	try(Connection connection=DBConnection.createconnection();PreparedStatement preparedstatement=connection.prepareStatement("select*from emp1 where empid=?"))
	
	{
		preparedstatement.setInt(1,empid); 
		ResultSet resultset=preparedstatement.executeQuery();
		 if(resultset.next())
		 {
			 employee=new Employee();
		     employee.setEmpid(resultset.getInt(1));
		     employee.setEmpname(resultset.getString(2));
		     employee.setEmpsalary(resultset.getDouble(3));	
	}
	}
	catch(SQLException e)
	{
		e.printStackTrace();
	}
	return employee;
}
   public List<Employee> findAll()
   {
	   List<Employee> emps=new ArrayList<Employee>();
	   try(Connection connection=DBConnection.createconnection();Statement statement=connection.createStatement())
	   {
		   ResultSet resultset=statement.executeQuery("select*from emp1");
		   
		    while(resultset.next())
		    {
			    Employee employee=new Employee();

		    	employee.setEmpid(resultset.getInt(1));
		    	employee.setEmpname(resultset.getString(2));
		    	employee.setEmpsalary(resultset.getDouble(3));
		    	emps.add(employee);
		    }
		   
	   }
	   catch(SQLException e)
	   {
		   e.printStackTrace();
	   }
	   return emps;
   }
	public int deletebyId(int empid)
	{
		 int count=0;
		try(Connection connection=DBConnection.createconnection();PreparedStatement preparedstatement=connection.prepareStatement("delete from emp1 where empid=?"))
		{
			preparedstatement.setInt(1,empid);
		   count=preparedstatement.executeUpdate();
			
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		 return count;
	}
	public int deletebySalary(double empsalary)
	{
		int count1=0;
		try(Connection connection=DBConnection.createconnection();PreparedStatement preparedstatement=connection.prepareStatement("delete from emp1 where empsalary=?"))
		{
			preparedstatement.setDouble(1,empsalary);
		   count1=preparedstatement.executeUpdate();
			
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		 return count1;

	}
}