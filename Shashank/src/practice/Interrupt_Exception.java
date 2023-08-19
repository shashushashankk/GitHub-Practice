package practice;

public class Interrupt_Exception 
{
	public static void main(String[] args)  
	{
		for (int i = 0; i < args.length; i++) 
		{
			System.out.println(i);
			try 
			{
				Thread.sleep(2000);
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
	}
}