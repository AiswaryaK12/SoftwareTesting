package oops_concept;

public class MethodOverloading3 {

	public void add(int a,double b)
	{
		double c=a+b;
		System.out.println(c);
	}
	public void add(double a,int b)
	{
		double  c=a+b;
		System.out.println(c);
	}
	
	
	
	public static void main(String[] args) {
		MethodOverloading3 m=new MethodOverloading3();
	
		m.add(4.5, 6);
		m.add(6, 3.5);

	}

}
