package Looping_pgms;

public class Prime_NO_Sum 
{
	public static void main(String[] args) 
	{
		int sum=0;
		for (int l=1; l<=100; l++)
			
		{
			int no=l;
			int count=0;
			for(int i = 1; i<=no; i++)
			{
				if(no%i==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				sum=sum+no;
			}
		}
		System.out.println(sum);
	}
}
