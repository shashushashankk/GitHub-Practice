package Testyentra;

public class _2D_StringArray {
	public static void main(String[] args) {
		
		String arr[][]= {{"jhd0","fjj","dh"},{"dhh","ejh","dgt","ehdv"}};
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
			System.out.println(arr.length+" "+arr[0].length);
		}
	}

}
