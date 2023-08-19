package Testyentra;

public class Even_no_Ternari 
{
	public static void main(String[] args) 
	{
		for (int i = 0; i <=20; i++) 
		{
			int k=(i%2==0)?i:0;
			if(k!=0)
			{
				System.out.println(k);
			}
			//System.out.println((i%2==0) ? i:"");
			
		}
	}

}
