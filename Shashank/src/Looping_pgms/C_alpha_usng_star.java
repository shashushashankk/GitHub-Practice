package Looping_pgms;

public class C_alpha_usng_star 
{
	public static void main(String[] args) 
	{
		for (int row= 1; row<=8; row++) 
		{
			for (int col = 1; col<=8; col++) 
			{
				if(col==1&&row!=1&&row!=8||(row==1||row==8)&&col%2!=1&&col!=8||(row==2||row==7)&&col==8)
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
