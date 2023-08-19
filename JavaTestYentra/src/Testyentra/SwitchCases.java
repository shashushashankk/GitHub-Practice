package Testyentra;

public class SwitchCases 
{
	public static void main(String[] args) {
		String k="1Ab2cd3$&ljd%$545HJGH";
		String Alp="";
		String dig="";
		String sp="";
		
		for (int i = 0; i < k.length(); i++) {
				char var =k.charAt(i);
				int key=0;
				/*if (Character.isAlphabetic(var)) {
					key=1;
				}
				else if (Character.isDigit(var)) {
					key=2;
				}
				else  {
					key=3;
				}
			switch (key) {
			
			case (1):
					Alp=Alp+var;
					break;
			case (2):
					dig=dig+var;
					break;
			case(3):
					sp=sp+var;
					break;
			}*/
				key=Character.isAlphabetic(var)?1:Character.isDigit(var)?2:3;
				switch (key) {
				
				case (1):
						Alp=Alp+var;
						break;
				case (2):
						dig=dig+var;
						break;
				case(3):
						sp=sp+var;
						break;
		}
		}
		System.out.println(Alp);
		System.out.println(dig);
		System.out.println(sp);
	
	}
}
