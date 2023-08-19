package Looping_pgms;

public class Prim_and_nonprime_numbers {
	public static void main(String[] args) {
		for(int b=1; b<=100; b++)
		{
			int no=b;
			int count=0;
			for(int i=1; i<=no; i++)
			{
				if(no%i==0)
				{
					count++;
				}
			}  
			if(count==2)
			{
				System.out.println(no+" is a primr number");
			}
			else
			{
				System.out.println(no+" is not a prime number");
			}
		}
	}

}
