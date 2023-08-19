package practice;

public class Try_catch_finally 
{
	public static void main(String[] args) 
	{
		System.out.println("------main starts------");
		int[] s= {2,25,78,59,45};
		try
		{
		System.out.println(s[10]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("-------Handled------");
		}
			System.out.println("-------main ends------");
		
	}
}