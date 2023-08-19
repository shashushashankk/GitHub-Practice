package Testyentra;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayList1 {
	public static void main(String[] args) {
		ArrayList l=new ArrayList();
		l.add(10);
		l.add(20);
		l.add(85);
		l.add("dksjh");
		l.add('s');
		ListIterator ltr =l.listIterator();
		while(ltr.hasNext())
		{
			Object obj= ltr.next();
			System.out.println(obj);
		}
		System.out.println();
		while(ltr.hasPrevious())
		{
			Object obj= ltr.previous();
			System.out.println(obj);
		}
	}

}
