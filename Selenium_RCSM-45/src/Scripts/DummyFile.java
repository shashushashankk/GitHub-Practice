package Scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DummyFile 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/Shashank%20Shetty/Desktop/Q%20spider/Selenium/HTML/dummy.html");
		WebElement d= driver.findElement(By.tagName("input"));
		d.clear();
		Thread.sleep(2000);
		d.sendKeys("world");
		Thread.sleep(2000);
		d.sendKeys(" jdcjh");
		Thread.sleep(2000);
		WebElement s= driver.findElement(By.name("name"));
		s.clear();
		Thread.sleep(2000);
		s.sendKeys("Hello");
		Thread.sleep(2000);
		s.sendKeys(" lpo;l");
	}
	
}
