package Looping_pgms;

public class Non_prime_sum {
	public static void main(String[] args) {
		int sum=0;
		for(int e=1; e<=100; e++)
		{
			int no=e;
			int count=0;
			for(int i=1; i<=no; i++)
			{
				if(no%i==0)
				{
					count++;
				}
			}
			if(count!=2)
			{
				sum++;
			}
		}
		System.out.println(sum);
	}

}
