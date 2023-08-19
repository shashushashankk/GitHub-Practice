package Shashank;

public class Char_array_dup_remove {
	public static void main(String[] args) {
		String k = "Karnataka";
		char[] h=k.toCharArray();
		for (int i = 0; i < h.length-1; i++) {
			for (int j = i+1; j < h.length-1; j++) {
				if(h[i]==h[j+1])
				{
					h[j+1]='z';
					
				}
			}
		}
		for (int k1 = 0; k1 < h.length; k1++) {
			
			if(h[k1]!='z')
			{
			System.out.println(h[k1]);
			}
		}
	}
}
