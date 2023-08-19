package Shashank;

public class Checkingeachandevery 
{
public static void main(String[] args)  
{
	String s="Shashank";
		for (int i = 0; i < s.length(); i++) 
		{
			try
			{
				Thread.sleep(1000);
			} 
			catch (InterruptedException e) 
			{
				
				e.printStackTrace();
			}
			char d=s.charAt(i);
			System.out.println(d);
		}
}
}
