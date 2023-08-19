package Looping_pgms;

public class Bubble_sort_array {
	public static void main(String[] args) throws InterruptedException  {
		int[] arr= {52,54,58,6,25,3,7,8,1,6,0};
		int no=arr.length;
		for (int y=0; y<no-1; y++)
		{
			for(int j=0;j<no-1; j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					 arr[j]=arr[j+1];
					 arr[j+1]=temp;
				}
			}
		}
		
		
		
		for(int i=0; i<arr.length; i++)
		{
		Thread.sleep(1000);
		System.out.println(arr[i]);
		}
	}

}
