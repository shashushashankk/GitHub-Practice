package Shashank;
import java.util.*;
public class Iterator1 
{
	public static void main(String[] args) throws InterruptedException {
		ArrayList s=new ArrayList();
		s.add(4589);
		s.add(5875);
		s.add("jhfdsh");
		s.add('f');
		s.add(50.6);
		s.add(52.052f);
		s.add("dtyhrty");
		System.out.println(s);
		Iterator h=s.iterator();
		while(h.hasNext())
		{
			Thread.sleep(1000);
			Object a=h.next();
			System.out.println(a);
		}
		
		ListIterator h1=s.listIterator();
		while(h1.hasNext())
		{
			Thread.sleep(3000);
			Object a=h1.next();
			System.out.println(a);
		}
		while(h1.hasPrevious())
		{
			Thread.sleep(3000);
			Object d=h1.previous();
			System.out.println(d);
		}
		
	}
	
}
