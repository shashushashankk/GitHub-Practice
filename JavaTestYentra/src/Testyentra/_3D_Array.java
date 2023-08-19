package Testyentra;

import java.util.Scanner;

public class _3D_Array {
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Object[][] arr = withNewOperator();
		print3DArray(arr);
		withoutNewOperator();

	}

	public static Object[][] withNewOperator() {
		System.out.println("Enter row size");
		int row=sc.nextInt();
		System.out.println("Enter col size");
		int col=sc.nextInt();
		System.out.println("Enter array elements");
		Object arr[][] = new Object[row][col];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = sc.next();
			}
		}
		return arr;
	}

	public static void withoutNewOperator() {
		Object arr[][] = { { 1, 2, 8, 6, 8 }, { "ds", "fsd", "sdf" }, { "dsfih", 89, 'c' } };
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				System.out.print(arr[row][col] + " ");
			}
			System.out.println();
		}
	}

	public static void print3DArray(Object[][] arr) {
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				System.out.print(arr[row][col]+" ");
			}
			System.out.println();
		}
	}
}
