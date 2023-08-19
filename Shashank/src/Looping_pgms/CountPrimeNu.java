package Looping_pgms;

public class CountPrimeNu 
{
	public static void main(String[] args) 
	{
		int sum = 0;
		for(int k=1; k<=100; k++)
		{
			int no=k;
			int count=0;
			for(int i=1; i<=100; i++)
			{
				if(no%i==0)
				{
					count++;
				}
			}
				if (count==2)
				{
					sum=sum+1;
				}
		}
		
		System.out.println(sum);
		
	}

}
