package Testyentra;

import java.util.Scanner;

public class StringReplace {
	public static void main(String[] args) {//next and nextLine Difference
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the tring");
		String s1=sc.next();
		String[] arr= s1.split(" ");
		String a="";
		System.out.println("Enter replace word");
		String s2=sc.next();
		for(String k: arr)
		{
			if(k.equals(s2))
			{
				System.out.println("enter new word");
				String s3=sc.next();
				a+=s2+" ";
			}
			else
			{
				a+=k+" ";
			}
		}
		System.out.println(a);
	}

}
