package oops_concept;
interface whatsappcalls
{
	void calls();
	void mute();
	void disconnect();
}

class Audiocalls implements whatsappcalls
{

	@Override
	public void calls() {
		System.out.println("whatsappcalls");		
		
		
	}

	@Override
	public void mute() {
		System.out.println("whatsapp call muted");
		
	
	}

	@Override
	public void disconnect() {
		System.out.println("whatsapp call disconnected");
		
	}
	
}
class Videocall implements whatsappcalls
{

	@Override
	public void calls() {
		
		System.out.println("whatsappvideocalls");	
	}

	@Override
	public void mute() {
		System.out.println("whatsapp videocall muted");
	}

	@Override
	public void disconnect() {
		System.out.println("whatsapp videocall disconnected");
		
	}
	
}
public class Interface {

	public static void main(String[] args) {
		Audiocalls a=new Audiocalls();
		a.calls();
		a.mute();
		a.disconnect();
		
		Videocall v=new Videocall();
		v.calls();
		v.mute();
		v.disconnect();
		
		// ob is a reference of interface whatsappcalls same objects for both child class 
		whatsappcalls ob=new Audiocalls();
		ob.calls();
		ob.mute();
		ob.disconnect();
		
		ob=new Videocall();
		ob.calls();
		ob.mute();
		ob.disconnect();

	}

}
