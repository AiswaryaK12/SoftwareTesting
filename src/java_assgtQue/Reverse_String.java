package java_assgtQue;

public class Reverse_String {

	public static void main(String[] args) {
		
		String s="JAVAPROGRAM";
		String r=" ";
		for(int i = 0; i<(s.length());i++)
		{
	      char ch = s.charAt(i);
	      r=ch+r;
			
		}
		System.out.println("Reverse string = "+r);
	}

}
