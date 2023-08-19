package Looping_pgms;

public class Array123heigestnumber 
{
	public static void main(String[] args) 
	{
		int[] arr= {4,23,5,6,89,17,256,32,65,58,6,2,85,4,6,7};
			int largest_1st=0;
			int largest_2nd=0;
			int largest_3rd=0;
			
			for(int i: arr)
			{
				if(largest_1st<i)
				{
					largest_3rd=largest_2nd;
					largest_2nd=largest_1st;
					largest_1st=i;
				}
				if(largest_2nd<i && i!=largest_1st)
				{
					largest_3rd=largest_2nd;
					largest_2nd=i;
				}
				if(largest_3rd<i && i!=largest_2nd && i!=largest_1st)
				{
					largest_3rd=i;
				}
			}
		System.out.println(largest_1st);
		System.out.println(largest_2nd);
		System.out.println(largest_3rd);		
	}
}
