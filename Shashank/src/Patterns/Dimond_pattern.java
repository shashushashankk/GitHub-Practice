package Patterns;

public class Dimond_pattern 
{
	public static void main(String[] args) 
	{
		int star=1;
		int space =4;
		for(int s=1; s<=5; s++)
		{
			for(int i=1; i<=space; i++)
			{
				System.out.print(" ");
			}
			
			for(int t=1;t<=star; t++)
			{
				System.out.print("* ");
			}
			System.out.println();
			star++;
			space--;
		}
		int star1=4;
		int space1 =1;
		for(int s=1; s<=4; s++)
		{
			for(int i=1; i<=space1; i++)
			{
				System.out.print(" ");
			}
			
			for(int t=1;t<=star1; t++)
			{
				System.out.print("* ");
			}
			System.out.println();
			star1--;
			space1++;
		}
		
	}

}
