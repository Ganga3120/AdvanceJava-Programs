package com.sathya.jdbc;

import java.beans.Statement;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
public class ProductDao {
    
	public int createProductTable() throws ClassNotFoundException
	{
		Connection connection=null;
		java.sql.Statement statement=null;
		int count=0;
		try
		{
			connection=DBConnection.createConnection();
			statement=connection.createStatement();
			String q="create table product1(pid number,pname varchar2(20),pprice number)";
			count=statement.executeUpdate(q);
			  
		}
		catch(SQLException s)
		{
			s.printStackTrace();
		}
		return count;
	}
	public int SaveProduct(Product product) throws ClassNotFoundException
	{
		Connection connection=null;
		PreparedStatement preparedstatement=null;
		int count=0;
		try
		{
			connection=DBConnection.createConnection();
			preparedstatement=connection.prepareStatement("insert into product1 values(?,?,?)");
			preparedstatement.setInt(1,product.getPid());
			preparedstatement.setString(2,product.getPname());
			preparedstatement.setDouble(3,product.getPprice());
			count=preparedstatement.executeUpdate();
			
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return count;
	}
	public Product getProductById(int pid) throws ClassNotFoundException, SQLException
	{
		Connection connection=null;
		PreparedStatement preparestatement=null;
		Product product=null;
		try
		{
			connection=DBConnection.createConnection();
			 preparestatement=connection.prepareStatement("select * from product1 where pid=?");
			 preparestatement.setInt(1,pid);
			 ResultSet resultset=preparestatement.executeQuery();
			 while(resultset.next())
			 {
				 product=new Product();
				 product.setPid(resultset.getInt(1));
				 product.setPname(resultset.getString(2));
				 product.setPprice(resultset.getDouble(3));
			 
		
			 }
			 
		 }
			 catch(SQLException e)
			 {
				 e.printStackTrace();
			 }
		finally
		{
			if(connection!=null)
				connection.close();
			if(preparestatement!=null)
				preparestatement.close();
		}
		 return product;
	}
	public List<Product> getAllProducts() throws SQLException, ClassNotFoundException
	{
		List<Product> prd=new ArrayList<Product>();
		try(Connection connection=DBConnection.createConnection();java.sql.Statement statement=connection.createStatement();)
				{
					ResultSet resultset=statement.executeQuery("select*from product1");
					while(resultset.next())
					{
						Product product=new Product();
						product.setPid(resultset.getInt(1));
						product.setPname(resultset.getString(2));
						product.setPprice(resultset.getDouble(3));
						prd.add(product);
					}
				}
		     catch(SQLException s)
		{
		    	 s.printStackTrace();
		}
		return prd;
	}
 public int deleteBYId(int pid) throws ClassNotFoundException, SQLException
 {
	 int count=0;
	 try(Connection connection=DBConnection.createConnection();PreparedStatement preparestatement=connection.prepareStatement("delete from product1 where pid=?");)
		{
		 preparestatement.setInt(1,pid);
		 count=preparestatement.executeUpdate();
		}
	 catch(SQLException a)
	 {
		 a.printStackTrace();
	 }
	 return count;
 }
	public int deleteBYPrice(double pprice) throws ClassNotFoundException, SQLException	
	{
		int count=0;
		try(Connection connection=DBConnection.createConnection();java.sql.PreparedStatement preparestatement=connection.prepareStatement("delete from product1 where pprice=?");)
		
		{
			preparestatement.setDouble(1,pprice);
			count=preparestatement.executeUpdate();
			
		}
		catch(SQLException a)
		{
			a.printStackTrace();
		}
		return count;
	}
	public int dropTable() throws ClassNotFoundException, SQLException
	{
		int count=0;
		try(Connection connection=DBConnection.createConnection();java.sql.Statement statement=connection.createStatement();)
		{
			String q="drop table product1";
			count=statement.executeUpdate(q);
		} 
		catch(SQLException a)
		{
			a.printStackTrace();
		}
		return count;
	}
	public int UpdateByPrice( double priceRange,double IncrementValue) throws ClassNotFoundException
	{
		int count=0;
		try(Connection connection=DBConnection.createConnection();java.sql.PreparedStatement preparestatement=connection.prepareStatement("update product1 set pprice=pprice+? where pprice>=?");)
		{
       preparestatement.setDouble(1,IncrementValue);
				preparestatement.setDouble(2,priceRange);
				count=preparestatement.executeUpdate();
	}
	catch(SQLException a)
		{
		 a.printStackTrace();
		}
		 return count;
}
}
