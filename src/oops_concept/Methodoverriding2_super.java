package oops_concept;
//method overriding

class parent

{
	
public void phone()
	{
		System.out.println("nokia");
	}
}
class child extends parent
{
	public void phone()
	{
		super.phone();
		System.out.print("iphone");
	}
}

public class Methodoverriding2_super {

	public static void main(String[] args) {
		
		child c=new child();
		c.phone();

	}

}
