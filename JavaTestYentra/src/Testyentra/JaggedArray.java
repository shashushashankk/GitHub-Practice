package Testyentra;

import java.util.Scanner;

public class JaggedArray {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		int arr[][]=new int[3][];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter size of Array");
			 arr[i]=new int[sc.nextInt()];
			 for (int j = 0; j < arr[i].length; j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}

}
