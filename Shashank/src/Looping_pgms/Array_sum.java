package Looping_pgms;

public class Array_sum 
{
	public static void main(String[] args) 
	{
		
		int[] arr= {123,456,789};
		for(int s=0; s<arr.length;s++)
		{
			int no=arr[s];
			int sum=0;
			int finalsum=0;
			while(no!=0)
			{
				int rem=no%10;
				sum=sum+rem*rem;
				no=no/10;
			}
			int ref=arr[s];
			while(ref!=0)
			{
				if(sum>9)
				{
					while(sum!=0)
					{
						int rem1=sum%10;
						finalsum=finalsum+rem1;
						sum=sum/10;
					}
					sum=finalsum;
				}
				finalsum=0;
				ref=ref/10;
			}
			if(sum!=0&& sum<=9)
			{
				System.out.println(sum);
			}
		}
		                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             
	}
}