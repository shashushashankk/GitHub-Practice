package Testyentra;

public class AddNumer {
	public static void main(String[] args) {
		String s="My1 name2 is3 Rajesh4 Sig5";
		char[] a= s.toCharArray();
		
		int num=0;
		for (int i = 0; i < a.length; i++) {
			String x="";
				if(Character.isDigit(a[i]))
				{
					 x=x+a[i];
					 num= num+Integer.parseInt(x);
				}
		}
		System.out.println(num);
	}

}
