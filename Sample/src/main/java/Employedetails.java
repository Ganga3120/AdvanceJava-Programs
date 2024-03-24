import java.util.*;
class Employee
{

	int empiid;
	String empname;
	double salary;
	public Employee(int empiid, String empname, double salary) {
		super();
		this.empiid = empiid;
		this.empname = empname;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [empiid=" + empiid + ", empname=" + empname + ", salary=" + salary + "]";
	}
	
}
public class Employedetails {
	public static void main(String[] args) {
  Employee e=new Employee(100,"radha",2000);
   System.out.println(e);
	}

}
