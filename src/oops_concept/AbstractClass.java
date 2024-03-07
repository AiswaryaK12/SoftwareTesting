package oops_concept;


abstract class Google
{
	abstract void search();
	
	public void message()
	{
		System.out.println("thank u for using google");
	}
}


class searchAll extends Google
{

	@Override
	void search() {
			System.out.println("search details");
		
	}
	
}

class searchImage extends Google
{

	@Override
	void search() {
		System.out.println("image search results");
		
	}
	
}

class searchVideo extends Google
{

	@Override
	void search() {
		System.out.println("search video");
		
	}
	
}
public class AbstractClass {

	public static void main(String[] args) {
		searchAll a=new searchAll();
		a.message();
		a.search();
		
		
		searchImage b=new searchImage();
		b.message();
		b.search();
		
		
		searchVideo c=new searchVideo();
		c.message();
		c.search();

	}

}
