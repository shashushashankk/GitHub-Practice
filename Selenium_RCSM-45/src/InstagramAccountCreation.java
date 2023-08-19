import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramAccountCreation 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.instagram.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Sign up']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='emailOrPhone']")).sendKeys("shashankkshetty2000@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='fullName']")).sendKeys("Shashank_Shetty");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Shashank_shetty_98");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("shashu@1234");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(20000);
		driver.findElement(By.xpath("//button[text()='Next']")).click();
		Thread.sleep(20000);
		driver.findElement(By.xpath("//button[@type='button']")).click();
		
	}
}
