package oops_basics;

public class Employee {
	int empid;
	int salary;
	String empname;
	int depno;
	
	
	
public void display()
{
	System.out.println(empid);
	System.out.println(salary);
	System.out.println(empname);
	System.out.println(depno);
}

public static void main (String [] args) {
	Employee emp=new Employee();
	emp.empid=101;
	emp.salary=20000;
	emp.empname="Aiswarya";
	emp.depno=5;
	emp.display();
	
}
}