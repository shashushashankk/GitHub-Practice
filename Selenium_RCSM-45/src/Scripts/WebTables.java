package Scripts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTables 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.get("https://demoqa.com/webtables");
		for (int i = 0; i < 3; i++) 
		{
			Thread.sleep(5000);
			driver.findElement(By.xpath("//span[@title='Delete']")).click();
		}
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='addNewRecordButton']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Shashank");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("K");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("shashankk@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='age']")).sendKeys("25");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='salary']")).sendKeys("400000");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='department']")).sendKeys("Software Test Engineer");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='submit']")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@id='addNewRecordButton']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Sachin");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("S Y");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("Sachin@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='age']")).sendKeys("23");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='salary']")).sendKeys("400000");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='department']")).sendKeys("Software Developer");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='submit']")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@id='addNewRecordButton']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Manoj");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("K");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("Manoj@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='age']")).sendKeys("22");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='salary']")).sendKeys("400000");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='department']")).sendKeys("Project Manager");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='submit']")).click();
		
	}

}
