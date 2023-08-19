package Testyentra;

import java.util.ArrayList;

public class ArrayList15 {
	public static void main(String[] args) {
		ArrayList h=new ArrayList();
		h.add(15);
		h.add(20);
		h.add(5);
		h.add(86);
		h.add(53);
		h.add(3);
		for(Object a:h)
		{
			int g= (int) a;
			if(g%2==1)
			{
				System.out.println(g);
			}
		}
	}

}
