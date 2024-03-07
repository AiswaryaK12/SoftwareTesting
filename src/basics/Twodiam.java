package basics;

import java.util.Scanner;

public class Twodiam {

	public static void main(String[] args) {
		String arr[][]=new String[2][3];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your names:");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
			{
				arr[i][j]=sc.next();
			}
		}
		System.out.println("entered names are:");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

	}

}
