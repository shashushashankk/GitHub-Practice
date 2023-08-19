
class Whatsapp1
{
	void sum()
	{		
		System.out.println("Sachin");		
	}	
}
class Whatsapp2 extends Whatsapp1
{
	
	 void sum()
	{
		System.out.println("Shashank k");
		super.sum();
	}
	 void disp()
	 {
		 System.out.println("mjhgasfgbjdfygudrfghhv");
	 }
}
public class Overriding 
{
	public static void main(String[] args) 
	{
		Whatsapp2 w =new Whatsapp2();
		w.sum();	 
		w.disp();
	}
}
