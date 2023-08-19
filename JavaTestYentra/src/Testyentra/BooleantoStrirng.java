package Testyentra;

public class BooleantoStrirng {
	public static void main(String[] args) {
		int[]a= {1,5,36,5};
		String s="";
		for (int i = 0; i < a.length; i++) {
			s=s+a[i]+" ";
		}
		boolean e=true;
		String f=""+e;
		System.out.println(f);
		System.out.println(s);
	}
}