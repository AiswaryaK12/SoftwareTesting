package basics;

import java.util.Scanner;

public class OnedimenArray {

	public static void main(String[] args) {
		int a[]=new int[6];   //declare array
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your numbers:");
		for(int i=0;i<6;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("entered nos are:");
		for(int i=0;i<6;i++)
		{
			System.out.println(a[i]);
		}

	}

}
