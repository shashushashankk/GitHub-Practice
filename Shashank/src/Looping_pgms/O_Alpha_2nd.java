package Looping_pgms;

public class O_Alpha_2nd 
{
	public static void main(String[] args) 
	{
		for (int row= 1; row<=5; row++) 
		{
			for (int col = 1; col<=9; col++) 
			{
				if((col==1||col==9)&&row!=1&&row!=5||(row==1||row==5)&&col%2==1&&col!=1&&col!=9)
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
