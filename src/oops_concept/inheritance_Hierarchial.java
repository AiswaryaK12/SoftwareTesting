package oops_concept;

//Hierarchialinheritance

class bird
{
	public void flying()
	{
		System.out.println("bird is flying");
	}
}

class parrot extends bird
{
	
	public void singing()
	{
		System.out.println("parrot is singing");
	}
}

class peacock extends bird
{
	public void dancing()
	{
		System.out.println("peacock is dancing");
	}
}
public class inheritance_Hierarchial {
	public static void main (String []args)
	{
		parrot pr=new parrot();
		pr.flying();
		pr.singing();
		
		peacock pk=new peacock();
		pk.flying();
		pk.dancing();
		
	}

}
