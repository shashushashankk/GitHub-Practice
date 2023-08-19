package Testyentra;

public class _2dArray {
	public static void main(String[] args) {
		int arr[][]= {{1,2,36,14,68},{44,58,69,4,23,66,},{45,8,5,58,55}};
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				System.out.print(arr[row][col]+" ");
			}
			System.out.println();
		}
	}
}
