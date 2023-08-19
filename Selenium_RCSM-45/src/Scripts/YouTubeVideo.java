package Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YouTubeVideo 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.youtube.com");
		driver.manage().window().maximize();
		WebElement s= driver.findElement(By.name ("search_query"));
		Thread.sleep(1000);
		s.sendKeys("kgf 2 official trailer in kannada");
		Thread.sleep(2000);
		driver.findElement(By.id("search-icon-legacy")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("a[title='#KGF Official Trailer 2 Kannada | Yash | Srinidhi Shetty | Prashanth Neel | Vijay Kiragandur']")).click();
		
	}
}