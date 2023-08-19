package Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonOrderPlaced 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("Oneplus 10 pro mobile");
		driver.findElement(By.cssSelector("span[id='nav-search-submit-text']")).click();
		driver.findElement(By.linkText("OnePlus 10 Pro 5G (Emerald Forest, 12GB RAM, 256GB Storage) - Extra Exchange INR 10,000 on IOS & OP Users - Offer ends on 20th Dec")).click();
		driver.findElement(By.cssSelector("input[name='submit.add-to-cart']")).click();
	}

}
