package Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PerformingClickActionLink 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/Shashank%20Shetty/Desktop/Q%20spider/Selenium/HTML/youtuelink.html");
		Thread.sleep(2000);
		driver.findElement(By.tagName("a")).click();
	}
}
