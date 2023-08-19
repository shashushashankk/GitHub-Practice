package Testyentra;

import java.util.Scanner;

public class userArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size= sc.nextInt();
		int arr[]=new int[size];
		int sum=0;
		
		for (int i = 0; i < arr.length; i++) {
			int var=sc.nextInt();
			arr[i]=var;
		}
		for (int i = 0; i < arr.length; i++) {
			sum=sum+arr[i];
		}
		System.out.println(sum);
		
	}

}
