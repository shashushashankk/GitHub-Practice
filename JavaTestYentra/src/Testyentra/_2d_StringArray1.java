package Testyentra;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class _2d_StringArray1 {
		public static void main(String[] args) {
			@SuppressWarnings("resource")
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter nuber of Array ");
			int row=sc.nextInt();
			System.out.println("Enter Size of Array");
			int col =sc.nextInt();
			String arr[][]= new String[row][col];
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[i].length; j++) {
					System.out.println("Enter String Element");
					arr[i][j]=sc.next();
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
