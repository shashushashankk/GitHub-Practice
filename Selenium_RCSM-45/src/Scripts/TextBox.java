package Scripts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TextBox 
{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://demoqa.com/text-box");
		Thread.sleep(5000);	
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Shashak K");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("shashushashank156@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//textarea[@id='currentAddress']")).sendKeys("boys Pg, Dr. Rajkumar Road, 4th block, Rajajiagar ");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//textarea[@id='permanentAddress']")).sendKeys("Alagodu, Balehole post, Mudigere Taluk, Chikmagalore District");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='submit']")).click();
		
	}

}
