package Testyentra;

import java.util.Scanner;

public class StringArray {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Array Size");
		int size = sc.nextInt();
		String[] arr =new String[size];
		String k="";
		System.out.println("Array Element5");
		for (int i = 0; i < arr.length; i++) {
			String var= sc.next();
			arr[i]=var;
		}
		for (int i = 0; i < arr.length; i++) {
			String q=arr[i];
			if(k.length()<q.length())
			{
				k=arr[i];
			}
		}
		System.out.println(k);
		
	}
}
