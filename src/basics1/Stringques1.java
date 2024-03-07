package basics1;

public class Stringques1 {

	public static void main(String[] args) {
  //Q1
		String s1="jmeter";
		String s2="Performance testing tool";
		
		System.out.println(s1.concat(s2));
		
		System.out.println("---------------------------");

	//Q2	
		String s3="java language is platform independent";
		System.out.println(s3.contains("language"));
		if(s3.contains("language"))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		
		System.out.println("---------------------------");
		
	//Q3
		String s="Selenium webdriver is used for webapplication testing";
		
		String []a=s.split(" ");
		for(String s0:a)
		{
			System.out.println(s0);
			if(s0.contains("webapplication"))
			{
				break;
			}
					
		}
		
	
		

}}
