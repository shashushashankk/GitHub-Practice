package Shashank;
public class String_Array_remove 
{
	public static void main(String[] args) throws InterruptedException
	{
		String k ="hi hi I I am am am Ram Ram Ram";
		String[] arr=k.split(" ");
		for (int k1 = 0; k1 < arr.length-1; k1++) 
		{

			for (int i =k1+1; i < arr.length; i++) 
			{
				if(arr[k1].equals(arr[i]))
				{
					arr[i]="shashank";
				}
			
			}
			
		}
		for (int j = 0; j < arr.length; j++) 
		{
			if(arr[j]!="shashank")
			{
				Thread.sleep(1000);
					System.out.print(arr[j]+" ");
			}
		}
	}
}