package Looping_pgms;

public class B_alpha_usng_star 
{
	public static void main(String[] args) 
	{
		for (int row= 0; row<7; row++) 
		{
			for (int col = 0; col < 7; col++) 
			{
				if(col==0||(row==0||row==3||row==6)&&col<6&&col%2==0||col==6&&row!=0&&row!=3&&row!=6)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
			
		}
		
	}

}
