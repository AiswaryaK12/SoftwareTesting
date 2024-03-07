package basics1;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number:");
		int a=sc.nextInt();
		
		System.out.println("Enter secondt number:");
		int b=sc.nextInt();
		
		System.out.println("select operation");
		System.out.println("Addition-a: Subtraction-s: Multiplication m: Division-d: ");
		char ch=sc.next().charAt(0);
		switch(ch)
		{
		case 'a': 
			System.out.println("sum of given two number: "+(a+b));
			break;
		case 's': 
			System.out.println("sub of given two number: "+(a-b));
			break;
			default:
				System.out.println("invalid grade");
		}
		

	}

}
