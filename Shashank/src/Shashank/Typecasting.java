package Shashank;

public class Typecasting 
{
	int s ;
	Typecasting(double s)
	{
		this.s=(int)s;
	}

	public static void main(String[] args) 
	{
		Typecasting r= new Typecasting(526.9999);
		System.out.println(r.s);
	}

}
