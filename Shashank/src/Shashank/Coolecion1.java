package Shashank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Coolecion1 
{
	public static void main(String[] args) 
	{
		ArrayList s=new ArrayList();
		s.add(574);
		s.add(25765);
		s.add(257654);
		s.add("lkuyhds");
		s.add('d');
		s.add("jhgjcd");

		ArrayList s2=new ArrayList();
		s2.add(574);
		s2.add(25765);
		s2.add(257654);
		s2.add("lkuyhds");
		s2.add('d');
		s.addAll(s2);
		System.out.println(s);
	}
}