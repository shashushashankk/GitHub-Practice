package Testyentra;

import java.util.Arrays;

public class Array_Duplicate {
	public static void main(String[] args) {
		int arr[]= {3,58,6,5,8,9,58,5,56,0,52,5,65};
		int c[]=new int[arr.length];
		int k = 0;
		Arrays.sort(arr);
		for (int i = 0; i <arr.length-1; i++) {
			if (arr[i]!=arr[i+1]) {
				c[k]=arr[i];
				k++;
			}
		}
		c[k]=arr[arr.length-1];
		for (int i = 0; i <k; i++) {
			System.out.println(c[i]);
		}
	}

}
