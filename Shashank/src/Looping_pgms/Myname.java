package Looping_pgms;

public class Myname 
{
	public static void main(String[] args) throws InterruptedException 
	{
		int fsp=72;
		int bsp=66;
		for (int row= 1; row<=7; row++) 
		{
			for (int col =1; col<=72; col++) 
			{
				if(((col==1&&row<4&&row>1||col==7&&row>4&&row<7||row==1&&col!=1&&col%2==0||row==4&&col%2==0&&col!=1&&col!=7||row==7&&col%2==0&&col!=7)&&col<=7)
						||(col==9||col==15||row==4&&col>8&&col<16&&col%2==1)||(col==17&&row!=1||col==24&&row!=1||row==1&&col>16&&col<24&&col!=17&&col%2==0||row==4&&col%2==1&&col>16&&col<24)
						||((col==26&&row<4&&row>1||col==32&&row>4&&row<7||row==1&&col>26&&col<33&&col%2==0||row==4&&col%2==0&&col>26&&col<32||row==7&&col%2==0&&col>=26&&col!=32)&&col<=32)
						||(col==34||col==40||row==4&&col>33&&col<41&&col%2==1)||(col==42&&row!=1||col==49&&row!=1||row==1&&col>41&&col<49&&col!=42&&col%2==0||row==4&&col%2==1&&col>41&&col<49)
						||(col==51&&row!=1||col==57&&row!=1&&row!=7||col==63&&row!=7||(row==1&&col<57&&col>51||row==7&&col>57&&col<63)&&col%2==1&&col!=51&&col!=57&&col!=63)&&col>50&&col<64
						||(col==66||col==fsp&&col>66||col==bsp&&col>66))
				{
					System.out.print("*");
				} 
				else
				{
					System.out.print(" ");
				}
				Thread.sleep(100);
			}
			fsp=fsp-2;
			if(row>3)
			bsp=bsp+2;
			System.out.println();
			
		}
		
	}

}
