package Testyentra;
import java.util.Scanner;

public class _2dArraySc {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Decalre number of Array Size");
		int _1st =sc.nextInt();
		System.out.println("Declare 2nd Array Size");
		int _2nd  =sc.nextInt();
		int[][] arr=new int[_1st][_2nd];
		System.out.println("Enter Array Element");
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				arr[row][col]=sc.nextInt();
			}
		}
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				System.out.print(arr[row][col]+" ");
			}
			System.out.println();
		}
	}
}
