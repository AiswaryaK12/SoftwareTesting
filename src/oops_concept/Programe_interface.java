package oops_concept;

class Monkey
{
	public void jump()
	{
		System.out.println("jump");
	}
	public void bite()
	{
		System.out.println("bite");
	}
}

interface basicanimal
{
	void cat();
	void sleep();
}

class Human extends Monkey implements basicanimal
{
	public void speak()
	{
		System.out.println("speak");
	
	}

	@Override
	public void cat() {
		System.out.println("cat");
		
	}

	@Override
	public void sleep() {
		System.out.println("sleep");
		
	}

}



public class Programe_interface {

	public static void main(String[] args) {
		Human h=new Human();
		h.bite();
		h.jump();
		h.cat();
		h.sleep();
		h.speak();
		
		
	}

}
