package Web_Shop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RegisterForDemoWeShop 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://demowebshop.tricentis.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='ico-register']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='gender-male']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Shashank");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("K");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("shashankkshetty2000@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Shashu@1234");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("Shashu@1234");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Register']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
	}

}
