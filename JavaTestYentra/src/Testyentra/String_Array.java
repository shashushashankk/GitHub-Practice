package Testyentra;

import java.util.Scanner;

public class String_Array { 
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Array Size");
		int size = sc.nextInt();
		int Cou=0;
		String[] arr=new String[size];
		System.out.println("Array Element5");
		for (int i = 0; i < arr.length; i++) {
			String var= sc.next();
			arr[i]=var;
		}
		
		for (int i = 0; i < arr.length; i++) {
			String s=  arr[i];
			char [] var=s.toCharArray();
			for(char a:var)
			{
				if(a=='A') 
				{
					Cou++;
					break;
				}
			}
		}
		System.out.println(Cou);
	}

}
