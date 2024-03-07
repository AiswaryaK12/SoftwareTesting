package oops_basics;

//parameterized constructor

public class Empconstructor_parameterized {

	//define class variables
	int id;
	int salary;
	String designation;
	
	// constructor 
	
	public Empconstructor_parameterized(int id,int salary,String designation)
	{
		this.id=id;
		this.salary=salary;
		this.designation=designation;
	}

	public static void main (String [] args) {
		Empconstructor_parameterized ob=new Empconstructor_parameterized(110,30000,"Developer");
		System.out.println(ob.id);
		System.out.println(ob.salary);
		System.out.println(ob.designation);
	
	}
}