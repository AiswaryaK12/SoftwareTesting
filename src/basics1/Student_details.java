package basics1;
class Student
{
	public void mark()
	{
		System.out.println("mark");
	}
    public void showdetails()
    {
    	System.out.println("showdetails");
    }
}

interface principle
{
	void resign();
	void rejoin();
}
class Teacher extends Student implements principle
{
	public void department()
	{
		System.out.println("department");
	}

	@Override
	public void resign() {
		System.out.println("resign");
		
	}

	@Override
	public void rejoin() {
		System.out.println("rejoin");
		
	}
}
public class Student_details {

	public static void main(String[] args) {
		Teacher t=new Teacher();
		t.mark();
		t.showdetails();
		t.resign();
		t.rejoin();
		t.department();
		

	}

}
