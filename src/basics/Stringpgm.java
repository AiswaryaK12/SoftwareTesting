package basics;

public class Stringpgm {

	public static void main(String[] args) {
		//length of a string
		String s="welcome";
		System.out.println(s.length());
		     //  OR
		int w=s.length();
		System.out.println("length:"+w);
		
		
		//join two string
		String s1="hello";
		String s2="luminar";
		System.out.println(s1.concat(s2));
		
		System.out.println(1+2+s1);
		System.out.println(s1+1+2);
		
		
		String s5="Luminar";
		System.out.println(s5.toUpperCase());
		System.out.println(s5.toLowerCase());
		System.out.println(s5.endsWith("e"));
		System.out.println(s5.startsWith("l"));
		
		//compare two strings
		String a="abc";
		String b="Abc";
		System.out.println(a.equals (b));
		System.out.println(a.equalsIgnoreCase (b));
		
		//trim
		String s7=" hello ";
		System.out.println(s7.trim());
		
		//contains
		String s8="welcome to Luminar";
		System.out.println(s8.contains("luminar"));
		
		//substring
		String x="welcome";
		System.out.println(x.substring(3));
		System.out.println(x.substring(0,4));
		
		//replace
		System.out.println(x.replace("el","xy" ));
		
		//to display particular character
		System.out.println(x.charAt(4));
		
		
		
		//String ARRAY
		//Split
		String w1="welcome to luminar";
		String [] w2  = w1.split(" ");
		for(String w3:w2)
		{
			System.out.println(w3);
		}
		
		
		//tocharArray
		String t="hello";
		char []c1=t.toCharArray();
		for(char v:c1)
		{
			System.out.println(v);
		}

		
		
		


	}

}
