package Shashank;
class Sample123
{
	int x;
	public Sample123() 
	{
		System.out.println("Shashank1586258");
	}
	static void disp()
	{
		System.out.println("Shashank");
	}
}
class Tester1 extends Sample123
{
	static void samp()
	{
		System.out.println("Bharath kumar");
	}
}

public class Inheritence
{
	public static void main(String[] args) 
	{
		Tester1 s = new Tester1();
		System.out.println(s.x);
		Tester1.samp();
		Tester1.disp();
	}
}
