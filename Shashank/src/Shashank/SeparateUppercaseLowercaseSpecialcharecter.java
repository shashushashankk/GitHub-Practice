package Shashank;

public class SeparateUppercaseLowercaseSpecialcharecter 
{
	static String sc="";
	static String d="";
	public static void main(String[] args) 
	{
		String s="S87u&^dejk4&^698opojKGj(6";
		String u="";
		String l ="";
		
		for (int i = 0; i < s.length(); i++) 
		{
			char h =s.charAt(i);
			if(Character.isUpperCase(h))
			{
				 u=u+h;
			}
			else if(Character.isLowerCase(h))
			{
				l=l+h;
			}
			else if(Character.isDigit(h))
			{
				d=d+h;
				
			}
			else
			{
				sc=sc+h;
			}
			
		}
		System.out.println(u);
		System.out.println(l);
		System.out.println(sc);
		System.out.println(d);
		
	}

}
