package Shashank;

class Shashank
{
	int x;
	void disp()
	{
		System.out.println("Superclass");
	}
}
class Shasha extends Shashank
{
	void samp()
	{
		System.out.println("subclass");
	}
}
public class Typecastingclass 
{
		public static void main(String[] args) {
			Shashank k=(Shashank) new Shasha();
			k.disp();
			System.out.println(k.x);
			Shasha h=(Shasha) k;
			h.samp();
			h.disp();
			
		}
}                                                                                          
