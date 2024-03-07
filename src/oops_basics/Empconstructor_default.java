package oops_basics;

//default constructor
public class Empconstructor_default {
	
	//define class variables
	
	int id;
	int salary;
	String designation;
	
	//define constructor
	public Empconstructor_default()
	{
		id=111;
		salary=20000;
		designation="Tester";
		
	}
	
	
	public static void main (String[] args) {
		Empconstructor_default ob=new Empconstructor_default();
		System.out.println(ob.id);
		System.out.println(ob.salary);
		System.out.println(ob.designation);
	}

}
