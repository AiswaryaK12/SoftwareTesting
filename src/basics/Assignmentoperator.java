package basics;

public class Assignmentoperator {

	public static void main(String[] args) {
		int a=55;
		System.out.println(a);
		int b;
		b=a;
		System.out.println(b);
		
		b+=a;
		//b=b+a
		//b=55+55
		System.out.println(b);
		
		b-=a;
		//b=b-a
		//110-55=55
		System.out.println(b);
		
		b*=a;
		System.out.println(b);

		b/=a;
		System.out.println(b);
	}

}
