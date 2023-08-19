package Testyentra;

public class StringrReverseMetods 
{
	public static void main(String[] args) {
		String name="My name Is Shashank ggh";
		String arr[]=name.split(" ");
		String newarr="";
		for (int i = 0; i < arr.length; i++) {
			String h=arr[i];
				if (Character.isUpperCase(h.charAt(0))) {
					 
					newarr+=reverse(arr[i])+" ";
				}
				else {
					newarr+=arr[i]+" ";
				}
				
			}
		System.out.println(newarr);
	}
	static String reverse(String s)
	{
		String q="";
		for (int i = s.length()-1; i>=0;i--) {
			q=q+s.charAt(i);
		}
		return q;
	}

}
