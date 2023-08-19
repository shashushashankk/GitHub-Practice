package Patterns;

public class Kushi 
{
	public static void main(String[] args) throws InterruptedException 
	{
		for (int row = 1; row <=5; row++) 
		{
			for (int col = 1; col < 50; col++) 
			{
				if ((col==23||row==1||row==5)&&col>18&&col<28&&col%2==1)
				{
					System.out.print("*");
				}
				else 
				{
					System.out.print(" ");
				}
				Thread.sleep(50);
			}
				System.out.println();
		}
		System.out.println();
	
		int fr=8;
		int bc=16;
		for (int row = 6; row <=10; row++) 
		{
			for (int col = 1; col < 50; col++) 
			{
				if(col==10000)
				{
					System.out.print("* ");
				}
				
				
				if ((col==fr||col==bc)&&row!=6||(col==10||col==11||col==13||col==14)&&row==6||col==12&&row==7) 
				{
					System.out.print("* ");
				}
				else 
				{
					System.out.print("  ");
				}
				Thread.sleep(50);
			}
			System.out.println();
			fr++;
			bc--;
		}
		System.out.println();
		for (int row = 1; row <=5; row++) 
		{
			for (int col = 1; col < 50; col++) 
			{
				if ((col==19&&row!=5||col==27&&row!=5||row==5&&col!=19&&col!=27)&&col>18&&col<28&&col%2==1)
				{
					System.out.print("*");
				}
				else 
				{
					System.out.print(" ");
				}
				Thread.sleep(50);
			}
				System.out.println();
		}
		System.out.println();
		int front=-1;
		int back=5;
		for (int row = 1; row <=7; row++) 
		{
			for (int col = 1; col < 50; col++) 
			{
				if ((col==1||col==back||col==front)||
					(col==9&&row!=7||col==17&&row!=7||row==7&&col!=9&&col!=17&&col%2==0)&&col>8&&col<18||
					(col==20&&row<4&&row!=1||col==26&&row>4&&row!=7||(row==1&&col!=1||row==4||row==7)&&col%2==1)&&col>19&&col<27||
					(col==29||col==37||row==4&&col>28&&col<38&&col%2==1)||
					(col==45||(row==1||row==7)&&col>40&&col<50&&col%2==1))
				{
					System.out.print("*");
				}
				else 
				{
					System.out.print(" ");
				}
				Thread.sleep(50);
			}
			front++;
			back--;
				System.out.println();
		}
	}

}
