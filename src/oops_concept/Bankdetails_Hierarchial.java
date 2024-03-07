package oops_concept;

class Bank
{
	public void withdraw()
	{
		System.out.println("withdraw");
	}
	public void deposite()
	{
		System.out.println("deposite");
	}
}

class sbi extends Bank
{
	public void sbiintrest()
	{
		System.out.println("sbiintrest");
	}
}

class hdfc extends Bank
{
	public void loan()
	{
		System.out.println("hdfcloan");
	}
}


public class Bankdetails_Hierarchial {

	public static void main(String[] args) {
		sbi ob=new sbi();
		ob.sbiintrest();
		ob.deposite();
		ob.withdraw();
		
		hdfc sc=new hdfc();
		sc.deposite();
		sc.withdraw();
		sc.loan();
		

	}

}
