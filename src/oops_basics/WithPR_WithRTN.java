package oops_basics;

public class WithPR_WithRTN {
	
	public int sub(int a,int b)
	{
		int c=a-b;
		return c;
	}


	public static void main(String[] args) {
		WithPR_WithRTN b=new WithPR_WithRTN();
		System.out.println(b.sub(50, 20));
		

	}
	
	
}
