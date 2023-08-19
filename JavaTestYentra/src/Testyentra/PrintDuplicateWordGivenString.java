package Testyentra;

public class PrintDuplicateWordGivenString {

	public static void main(String[] args) {
		String s = "0has5khi6ssssserkjhhgasdikadfiu";
		System.out.println("Duplicate Array");
		duplicateArray(s);
		System.out.println("Unique Array");
		uiqueArray(s);
		System.out.println("Printing given Array");
		printGivenArray(s);
		
	}
	public static void duplicateArray(String s) {
		char[] k = s.toCharArray();
		for (int i = 0; i < k.length-1; i++) {
			int count = 0;
			for (int j = i + 1; j < k.length; j++) {
				if (k[i] == k[j]) {
					count++;
				}
			}
			if (count == 1) {
				System.out.println(k[i]);
			}
		}
	}
	public static void uiqueArray(String s) {
		char[] k = s.toCharArray();
		for (int i = 0; i < k.length-1; i++) {
			int count = 0;
			for (int j = i + 1; j < k.length; j++) {
				if (k[i] == k[j]) {
					count++;
				}
			}
			if (count == 0) {
				System.out.println(k[i]);
			}
		}
	}
	public static void printGivenArray(String s) {
		char[] k = s.toCharArray();
		for (int i = 0; i < k.length-1; i++) {
				System.out.println(k[i]);
		}
	}

}
