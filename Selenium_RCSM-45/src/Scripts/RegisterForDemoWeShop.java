package Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RegisterForDemoWeShop 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com");
		driver.findElement(By.xpath("//a[@class='ico-register']")).click();
		driver.findElement(By.xpath("//input[@id='gender-male']")).click();
		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Shashank");
		driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("K");
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("shashankkshetty2000@gmail.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Shashu@123");
		driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("Shashu@123");
		driver.findElement(By.xpath("//input[@value='Register']")).click();
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
		driver.quit();
	}

}
