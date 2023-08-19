package Testyentra;
public class Strig16 {
	public static void main(String[] args) {
		String s1="1Ab2cd3$&ljd%$545HJGH";
		String alp="";
		String Num="";
		String SplChar="";
		char[] ch=s1.toCharArray();
		for (int i = 0; i < ch.length; i++) 
		{
			if(Character.isAlphabetic(ch[i]))
			{
				alp=alp+ch[i];
			}
			else if(Character.isDigit(ch[i]))
			{
				Num=Num+ch[i];
			}
			else 
			{
				SplChar=SplChar+ch[i];
			}
			
		}
		System.out.println(alp);
		System.out.println(Num);
		System.out.println( SplChar);
	}

}
