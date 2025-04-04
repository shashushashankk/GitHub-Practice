package Shashank;
class Slipper
{
	public Slipper() 
	{
		 System.out.println("muhgfg");
	}
}
class Sheos extends Slipper
{
	public Sheos(int i) 
	{
		System.out.println(i);
	}
	void disp()
	{
		System.out.println("Subclass");
	}
}
public class Colcobject 
{
	public static void main(String[] args) 
	{
		Slipper s =new Sheos(10);
		s.dip();
	}
}
