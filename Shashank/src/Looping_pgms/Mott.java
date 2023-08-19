package Looping_pgms;

public class Mott {
	public static void main(String[] args) 
	{
		String[] arr = { "123", "456", "789" };

		int n = arr.length;

		for (int i = 0; i <= n - 1; i++) 
		{
			String s = arr[i];
			int no = Integer.parseInt(s);
			int sum = 0;
			int final_sum1 = 0;
			int final_sum2 = 0;

			while (no != 0) 
			{
				int rem = no % 10;
				sum = sum + (rem * rem);
				no = no / 10;

			}
			if (sum > 10) 
			{

				while (sum != 0)
				{
					int rem1 = sum % 10;

					final_sum1 = final_sum1 + rem1;
					sum = sum / 10;
				}
			} 
			else 
			{
				System.out.println(sum);
			}

			if (final_sum1 > 10) 
			{
				while (final_sum1!= 0) 
				{
					int rem2 = final_sum1 % 10;
					final_sum2 = final_sum2 + rem2;
					final_sum1 = final_sum1 / 10;

				}
				System.out.println(final_sum2);
			} 
			else if(final_sum1!=0)
			{
				System.out.println(final_sum1);
			}
		}
	}
}