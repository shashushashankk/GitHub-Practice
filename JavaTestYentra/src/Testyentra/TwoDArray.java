package Testyentra;

import java.util.Scanner;

public class TwoDArray {
	public int[][] add2DArray() {
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
		return arr;
	}

	public void Display2DArray(int arr[][]) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		TwoDArray array=new TwoDArray();
		int arr[][]=array.add2DArray();
		array.Display2DArray(arr);

	}

}
