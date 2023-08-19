package Testyentra;

import java.util.Scanner;

public class _2DGeneRicArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Row Size");
		int row=sc.nextInt();
		System.out.println("Enter col size");
		int col=sc.nextInt();
		int arr[][]=new int[row][col];
		System.out.println("Initialize the value");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
