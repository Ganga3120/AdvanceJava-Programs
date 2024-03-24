package com.sathya.jdbc;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.*;
public class ProductClient {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
   ProductDao productdao=new ProductDao();
//   int count=productdao.createProductTable();
// System.out.println("table created succesfully...."+count);
//  int res1= productdao.SaveProduct(new Product(1,"TV",3500.0));
//System.out.println("data inserted sucessfully.."+res1);
 // int res2=productdao.SaveProduct(new Product(2,"refrigirator",50000.0));
 //  System.out.println("data inserted successfully..."+res2);
   Product product1= productdao.getProductById(2);
   System.out.println(product1);
  // List<Product> pr=productdao.getAllProducts();
   //  for(Product p:pr)
   //System.out.println(p);
//   int count=productdao.deleteBYId(2);
//   System.out.println("data deleted successfully...."+count);
 //  int count1=productdao.deleteBYPrice(3500.0);
	//	   System.out.println("data deleted successfully.."+count1);
 //  int count=productdao.dropTable();
 //  System.out.println("table droped successfully...."+count);
 //  int count=productdao.UpdateByPrice(30000,50000 );
 //   System.out.println("data updated..."+count);
	}

}
