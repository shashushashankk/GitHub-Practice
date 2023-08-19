package Maps;

import java.util.Scanner;

public class Practice 
{
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) 
		{
			System.out.println("Enter the number");
			String s=sc.next();
			String fib="";
			for (int i = s.length()-1; i>=0; i--)
			{
				
				fib=fib+s.charAt(i);
			}
			if (s.equals(fib))
			{
				System.out.println("is Palindrome");
			}
			else
			System.out.println("is not Palindrome");
		}
	}
}
