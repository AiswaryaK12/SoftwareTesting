package oops_concept;

class SchoolDetails
{
	final String Schoolname="Luminar";
	static String department="English";
}

public class StaticFinal {

	public static void main(String[] args) {
		
		System.out.println(SchoolDetails.department);
		
		System.out.println(SchoolDetails.department="Malayalam");
		System.out.println(SchoolDetails.department);
		
		SchoolDetails ob=new SchoolDetails();
		System.out.println(ob.Schoolname);
		
		//can not change value
		//System.out.println(ob.Schoolname="bc");
	}
	

}
