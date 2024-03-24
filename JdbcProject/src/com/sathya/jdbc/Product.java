package com.sathya.jdbc;

public class Product {
int pid;
 String pname;
 double pprice;
public Product(int pid, String pname, double pprice) {
	super();
	this.pid = pid;
	this.pname = pname;
	this.pprice = pprice;
	
}

public Product() {
	// TODO Auto-generated constructor stub
}

public int getPid() {
	return pid;
}

public void setPid(int pid) {
	this.pid = pid;
}

public String getPname() {
	return pname;
}

public void setPname(String pname) {
	this.pname = pname;
}

public double getPprice() {
	return pprice;
}

public void setPprice(double pprice) {
	this.pprice = pprice;
}

@Override
public String toString() {
	return "Product [pid=" + pid + ", pname=" + pname + ", pprice=" + pprice + "]";
}
 
}
