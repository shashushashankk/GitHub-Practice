package Shashank;

class Demo
{
	public Demo(int a) 
	{
		System.out.println("Supermost class");
	}
}
class Tester extends Demo
{
	public Tester(String h) 
	{
		super(586);
		System.out.println("super class");
	}
}
class Sample extends Tester
{
	public Sample(double c) 
	{
		super("gfdyt");
		System.out.println("subclass");
	}
}
public class Supercalling 
{
	public static void main(String[] args) 
	{
		new Sample(10.63);
	}
}
