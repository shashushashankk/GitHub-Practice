package Java;
class WebElement
{
	static int s=10;
	void click()
	{
		System.out.println("My love");
		System.out.println(new WebElement().s);
	}
}

 class Sample125
{
	 int x=17;
	WebElement findElement(int b)
	{
		WebElement l=new WebElement();
		return l;
		
	}
}

public class ObjectAdressReturn 
{
	static  int tagName(int a)
	{
		return a;
	}

	public static void main(String[] args) 
	{
		Sample125 driver=new Sample125();
		driver.findElement(tagName(22 )).click();
	}

}
