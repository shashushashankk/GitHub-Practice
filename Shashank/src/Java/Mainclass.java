package Java;


public class Mainclass extends Thread
{
	int a =10;
	 void djhh()
	{
		System.out.println(a);
	}
	public static void main(String[] args) throws InterruptedException
	{
		Mainclass h =new Mainclass();
		System.out.println(h.a);
		h.djhh();
		sleep(2000);
	}
}
