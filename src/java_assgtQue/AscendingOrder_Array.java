package java_assgtQue;
import java.util.ArrayList;
import java.util.Collections;

public class AscendingOrder_Array {

public static void main(String[] args) {
		
         // Creating an array list
		
		  ArrayList<Integer> numbers = new ArrayList<>();

		   // Add elements
		        
		    numbers.add(4);
		    numbers.add(2);
	        numbers.add(3);
	        System.out.println("Unsorted ArrayList: " + numbers);
		    // Using the sort() method
		        
		     Collections.sort(numbers);
	       System.out.println("Sorted ArrayList: " + numbers);

	}
}
