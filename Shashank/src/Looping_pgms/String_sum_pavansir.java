package Looping_pgms;

public class String_sum_pavansir 
{
	public static void main(String[] args) 
	{
		String[] arr= {"123  ","456","789"};
		for(int k=0; k<arr.length; k++)
		{
			String no=arr[k];
			int sum=0;
			int final_sum=0;
			int final_sum1=0;
			int sha=Integer.parseInt(no);
			 while(sha!=0)
			 {
				 int rem=sha%10;
				 sum=sum+(rem*rem);
				 sha=sha/10;
			 }
			 if(sum>9)
			 {
				 while(sum!=0)
				{
					 int rem=sum%10;
					final_sum=final_sum+rem; 
					sum=sum/10;
				}	
			 }
			 else
			 {
				 System.out.println(sum);
			 }

			 if(final_sum>9)
			 {
				 while(final_sum!=0)
					{
						 int rem=final_sum%10;
						final_sum1=final_sum1+rem; 
						final_sum=final_sum/10;
					}
					 System.out.println(final_sum1); 
			 }
			 else if(final_sum!=0)
			 {
				 System.out.println(final_sum);
			 } 
		}
	}

}