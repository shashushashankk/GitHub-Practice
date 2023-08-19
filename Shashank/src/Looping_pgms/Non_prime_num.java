 package Looping_pgms;

public class Non_prime_num {
	public static void main(String[] args) {
		for(int f=1; f<=100; f++)
		{
			int no=f;
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
				System.out.println(no+" is a non-prime number");
			}
		}
		
	}

}
