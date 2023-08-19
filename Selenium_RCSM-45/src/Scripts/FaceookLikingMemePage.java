package Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FaceookLikingMemePage 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.faceook.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("shashankkshetty2000@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Shashu@1234");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@data-testid='royal_login_button']")).click();
		Thread.sleep(2000);
		WebElement s= driver.findElement(By.xpath("//input[@type='search' and @placeholder='Search Facebook']"));
		s.sendKeys("kannada meme world");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[text()='Kannada']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@aria-label='Kannada Meme World']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='x1i64zmx']/../div[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@aria-label='Notifications, 1 unread']/../../../../../span/div[1]/div[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[.='Log Out']")).click();
	}
}
