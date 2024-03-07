package oops_concept;

// singleinheretance
class Dog
{
	public void barking()
	{
		
	System.out.println("dog is barking");
	
	}
}
 class cat extends Dog
 {
	 public void sleeping()
	 {
		 System.out.println("cat is sleeping");
		 
	 }
	
 }

 // multilevel inheritance
 class lion extends cat
 {
	 public void running()
 {
 
	 System.out.println("lion is running");
 }

	 }
public class Inheritance_singmuliti_Animal {

	public static void main(String[] args) {
		cat c=new cat();
		c.sleeping();
		c.barking();

		lion l=new lion();
		l.barking();
		l.sleeping();
		l.running();
	}

}
