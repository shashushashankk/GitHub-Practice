package Testyentra;

public class TernaryOperator {
	public static void main(String[] args) {
		int count=0;
		for (int i = 1; i < 101; i++) {
			int y=i%2==0?i:i%3==0?i:count++;
			System.out.println(y);
		}
		System.out.println("Count"+" "+count);
	}
}
