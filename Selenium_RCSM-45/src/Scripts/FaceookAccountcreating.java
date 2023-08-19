package Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

class Sample implements Runnable
{
	public  void run()
	{
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.youtube.com");
		driver.manage().window().maximize();
		WebElement s= driver.findElement(By.name ("search_query"));
		try 
		{
			Thread.sleep(1000);
			s.sendKeys("kgf 2 official trailer in kannada");
			Thread.sleep(2000);
			driver.findElement(By.id("search-icon-legacy")).click();
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("a[title='#KGF Official Trailer 2 Kannada | Yash | Srinidhi Shetty | Prashanth Neel | Vijay Kiragandur']")).click();
			
		} catch (InterruptedException e) 
		{
			
			e.printStackTrace();
		}
		
	}
}
class Sample1 extends Thread
{
	public void run() 
	{
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.faceook.com");
		try 
		{
			driver.findElement(By.linkText("Sign Up")).click();
			driver.findElement(By.name("firstname")).sendKeys("Shashank");
			driver.findElement(By.name("lastname")).sendKeys("K");
			driver.findElement(By.cssSelector("input[aria-label='Mobile number or email address']")).sendKeys("7760327297");
			driver.findElement(By.cssSelector("input[type='password']")).sendKeys("7760327297");
			driver.findElement(By.cssSelector("select[title='Day']")).click();
			Thread.sleep(2000);	
		} 
		catch (InterruptedException e) 
		{
			
			e.printStackTrace();
		}
		
	}
}
public class FaceookAccountcreating 
{
	public static void main(String[] args) throws InterruptedException 
	{
		Runnable S =new Sample();
		Thread th=new Thread(S);
		th.start();
		
		Thread th1=new Sample1();
		th1.start();
	}
}



