package Shashank;
import java.util.ArrayList;

public class Addobjectobj 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ArrayList<Comparable> s=new ArrayList<Comparable>();
		s.add(25);
		s.add('h');
		s.add("hfytgfyfg");
		s.add("14765");
		s.add('7');
		s.add(589);
		s.add("7-");
		s.add(759);
		s.add("uhi");
		System.out.println(s);
		for(int x=0; x<s.size(); x++) 
		{
			Thread.sleep(1000);
			System.out.println(s.get(x));
		}
	}
}