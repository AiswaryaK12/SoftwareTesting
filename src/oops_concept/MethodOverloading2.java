package oops_concept;
//same name datatype is different

public class MethodOverloading2 {
	public void add(int a,int b)
	{
		int c=a+b;
		System.out.println(c);
	}
	public void add(int a,double b)
	{
		double c=a+b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		MethodOverloading2 ob=new MethodOverloading2();
		ob.add(5, 6);
		ob.add(4, 6.6);
		

	}

}
