package basics;

import java.util.Scanner;

public class ArrayString_foreachloop {

	public static void main(String[] args) {
		String arr[]=new String[4];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the names:");
		for(int i=0;i<4;i++)
		{
			arr[i]=sc.next();
		}
		System.out.println("entered names are:");
		for(String s:arr) //for(datatype tempvariable:arrayname)
		{
			System.out.println(s);
		}

	}

}
