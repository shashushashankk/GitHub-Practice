package Looping_pgms;

public class Asci_cap_value_withno 
{
	public static void main(String[] args) 
	{
		String s=("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
		String b=s.toLowerCase();
		String g=("0123456789");
		System.out.println("Alphabates"+"\t"+"Asci value"+" "+"Alphabates"+"\t"+"Asci value");
		for (int i = 0; i < s.length(); i++) 
		{
			int k=s.charAt(i);
			char a=s.charAt(i);
			int r=b.charAt(i);
			char e=b.charAt(i);
			System.out.println("     "+a+"\t"+"\t"+"    "+k+"     "+"\t"+e+"\t"+"    "+r);
		}
		System.out.println("Number"+"\t"+"Asci values");
		for (int l = 0; l<g.length(); l++)
		{
			int n=g.charAt(l);
			char m=g.charAt(l);
			System.out.println("  "+m+"\t"+"\t"+n);
		}
		
	}
}
