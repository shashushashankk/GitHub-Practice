package practice;

public class Stack_Winding 
{
	@SuppressWarnings("unused")
	static void disp4()
	{
		int s=1/0;
	}
	static void disp3()
	{
		disp4();
	}
	static void disp2()
	{
		disp3();
	}
	static void disp1()
	{
		disp2();
	}
	public static void main(String[] args) 
	{
		try
		{
		disp1();
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
	}
}