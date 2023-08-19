package Testyentra;

public class ReverseStri {
	public static void main(String[] args) {
		String name="My name Is Shashank ggh";
		String a[] = name.split(" ");
		String rev ="";
		for (int i = 0; i<a.length; i++) {
			String k= a[i];
			String dummy="";
			if(Character.isUpperCase(k.charAt(0)))
			{
				for (int j =k.length()-1; j>=0; j--) {
					dummy=dummy+k.charAt(j);
				}
				rev=rev+dummy+" ";
			}
			else {
				rev=rev+k+" ";
			}
		}
		System.out.println(rev);
	}

}
