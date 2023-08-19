package Testyentra;

interface hii
{
	 void Sample();
	 void Simple();
}
class shasha implements hii
{
	public void Sample()
	{
		System.out.println("Hii");
	}
	public void Simple()
	{
		System.out.println("hlo");
	}
}

public class DownCasting {
	
	public static void main(String[] args) {
		hii s=new shasha();
		shasha k=(shasha) s;
		k.Sample();
		k.Simple();
	}
}
