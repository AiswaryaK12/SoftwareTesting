package basics;

import java.util.Scanner;

public class TwodiaArray_foreachloop {

	public static void main(String[] args) {
		int ar[][]=new int [2][3];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter values");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
			{
				ar[i][j]=sc.nextInt();
			}
		}
		System.out.println("entered values");
		for(int a[]:ar)  //a[]=2 3 4 //to print values
		{
			for(int v:a)  //v=2 //v=3 //v=4//
			{
				System.out.print(v+" ");
			}
			System.out.println();
		}

	}

}
