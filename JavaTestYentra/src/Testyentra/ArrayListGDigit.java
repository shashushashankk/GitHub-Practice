package Testyentra;

import java.util.ArrayList;

public class ArrayListGDigit {
	public static void main(String[] args) {
		ArrayList<Integer> l=new ArrayList<Integer>();
		l.add(101);
		l.add(45);
		l.add(32);
		l.add(8);
		l.add(50);
		l.add(10);
		for(int a:l)
		{
			int c=(a%2==0)?a:0;
			if (c!=0) {
				System.out.println(c);
			}
			/*if (a%2==0) {
				System.out.println(a);
			}*/
		}
	}

}
