package oops_concept;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExcepHand_Chechd {

	public static void main(String[] args) throws FileNotFoundException, InterruptedException {
		FileInputStream f=new FileInputStream("E://Book.xlsx");
		System.out.println("STARTED");
		Thread.sleep(5000);
		System.out.println("stopped");

	}

}
