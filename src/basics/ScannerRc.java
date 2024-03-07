package basics;

import java.util.Scanner;

public class ScannerRc {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your age");
		int age=sc.nextInt();
		System.out.println("enter your name");
		String name= sc.next();
		System.out.println("enter the character");
		char c=sc.next().charAt(0);

	}

}


