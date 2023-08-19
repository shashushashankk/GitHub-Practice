import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon1stProduct 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.amazon.in");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("Alexa latest generation 2022");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id='nav-search-submit-button']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("div[class='aok-relative']")).click();
	}
}