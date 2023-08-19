
public class Overloading 
{
	  static void disp(int a)
	{
		System.out.println(a);
	}
	  static void disp(String a)
	{
		System.out.println(a);
	}
	  static void disp(int a, String b)
	{
		System.out.println(a+b);
	}
	  static void disp(String b, int a)
	{
		System.out.println(a+b);
	}
	  static void disp(double a)
	{
		System.out.println(a);
	}
	public   static void main(String[] args) 
	{
		
		disp(15);
		disp(256);
		disp("jgdwjugh");
		disp(16,"jutsj");
		disp("kjsad",458);
		disp(45.54);
		disp(455);
		
		
	}

}
