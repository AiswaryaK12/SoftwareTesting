package oops_concept;
class A
{
	void ml()
	{
		int a=10;
		System.out.println(a);
	}
}

class B extends A
{
	void ml()
	{
		int a=20;
		System.out.println("a");
	}
}

public class Methodoverriding {

	public static void main(String[] args) {
		
		B obj=new B();
		
		obj.ml();

	}

}
