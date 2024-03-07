package basics1;



public class ClassRoom
		{ 
		   
		    String name; 
		    int rollno; 
		    int mark; 
		   
		    public void store(String name,int rollno,int mark ) 
		    {
		    	this.name=name;
				this.rollno=rollno;
				this.mark=mark;
				
		    }
		    public void display( ) 
		    {
		    	System.out.println("name="+name);
		        System.out.println("rollno="+rollno);
		        System.out.println("mark="+mark);
		    }
		   
		    
		  
		  
		    public static void main(String[] args) 
		    { 
		    	ClassRoom em=new ClassRoom();
		 	   em.store("aisu", 3, 88);
		 	   em.display();
		 	   
		

	}

		}
