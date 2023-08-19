package Testyentra;

import java.util.ArrayList;

public class ArrayList3 {
	public static void main(String[] args) {
		ArrayList<Integer> l=new ArrayList<Integer>();
		ArrayList<Integer> f=new ArrayList<Integer>();
		l.add(101);
		l.add(45);
		l.add(32);
		l.add(8);
		l.add(50);
		l.add(10);
		l.add(3);
		for(int a:l)
		{
			if(a%2==0)
			{
				f.add(a);
			}
		}
		System.out.println(f);
	}
}
