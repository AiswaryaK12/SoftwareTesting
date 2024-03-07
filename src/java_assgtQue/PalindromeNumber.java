
package java_assgtQue;

public class PalindromeNumber {

	public static void main(String[] args) {
		int r,sum=0,temp;
		int n=1221;  //It is the number variable to be checked for palindrome
		
		temp=n;
		while(n>0)
		{
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;  //getting reminder
		}
		if(temp==sum)
			System.out.println("palindrome number");
		else
			System.out.println("not palindrome");

	}

}
