package Looping_pgms;

public class A_alpha_usng_star 
{
	public static void main(String[] args) 
	{
		int start=10;
		int end=10;
		for(int row=1; row<=10; row++)
		{
			for(int col=1; col<=20; col++)
			{
				if(col==start||col==end||row==5&& col>start && col<end&& col%2==0)
				{
				System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println("");
			start--;
			end++;
		}
		
	}
}
