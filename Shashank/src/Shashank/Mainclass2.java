package Shashank;

public class Mainclass2 
{

	public static void main(String[] args) 
	{
		long fib1=0;
		long fib2=1;
		long fib3;
		System.out.println(fib1);
		System.out.println(fib2);
		for(int i=0; i<=10; i++)
			
		{
			fib3 = (fib1+fib2);
			fib1 = fib2;
			fib2 = fib3;
			System.out.println(fib3);
		}
		
	}

}
