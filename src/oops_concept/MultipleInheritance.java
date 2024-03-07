package oops_concept;

interface Bank1
{
	void deposit();
	void withdraw();
}

interface Bank2
{
	void intrestrate();
	void balancedetails();
}

class ICICI implements Bank1,Bank2
{

	@Override
	public void intrestrate() {
		System.out.println("intrestrate");
		
	}

	@Override
	public void balancedetails() {
			System.out.println("balancedetails");
		
	}

	@Override
	public void deposit() {
		System.out.println("deposit details");
		
	}

	@Override
	public void withdraw() {
		System.out.println("withdraw details");
		
	}
	
}
public class MultipleInheritance {

	public static void main(String[] args) {
		ICICI ic=new ICICI();
		ic.intrestrate();
		ic.balancedetails();
		ic.deposit();
		ic.withdraw();

	}

}
