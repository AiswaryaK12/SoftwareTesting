package oops_concept;

//create a class members with following details
class Members
{
	String name;
	int age;
	String address;
	int salary;
// also has a method printdetails which print all details of members
	

	public void printdetails()
	{
	System.out.println("name=" + name);
	System.out.println("age=" + age);
	System.out.println("address=" + address);
	System.out.println("salary=" + salary);
	}
	
}
// classes worker and manager inherit

class Worker extends Members
{
	String specialization;
}


class Manager extends Members
{
	String department;
}

public class Memberdetails {
	
	
	public static void main(String[] args) {
		
	
		
		Worker e1=new Worker();
		e1.name="anu";
		e1.age=23;
		e1.address="kochi";
		e1.salary=20000;
		
		e1.specialization="selenium";
		e1.printdetails();
		
		System.out.println("Specialisation"+e1.specialization);
		
		
		Manager e2=new Manager();
		e2.name="aisu";
		e2.age=20;
		e2.department="ece";
		
		e2.printdetails();
		
	
	
	  }
	
   }
