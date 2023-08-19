import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramFollowRequest 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.instagram.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Shashank_shetty_98");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("shashu@1234");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[contains(text(),'Not')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[contains(text(),'Not')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Search']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("Shashank_Shetty_2016");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href='/shashank_shetty_2016/']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[contains(text(),'Follow')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(text(),'More')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(text(),' out')]")).click();
		Thread.sleep(2000);
		driver.close();
	}

}
