package Testyentra;

public class Strigreverse {
	public static void main(String[] args) 
	{
		String a = "Rajesh";
		String x="";
		char[] t=a.toCharArray();
		for (int i=t.length-1; i>= 0; i--)
		{
			if(/*t[i]>='A' &&t[i]<='Z'*/Character.isUpperCase(t[i]))
			{
				String p =""+t[i];
				x=x+p.toLowerCase();
			}
			else
			{
				String w =""+t[i];
				x=x+w.toUpperCase();
			}
		}
		System.out.println(x);
	}

}
