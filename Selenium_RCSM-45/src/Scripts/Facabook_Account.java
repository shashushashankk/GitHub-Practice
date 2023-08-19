package Scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Facabook_Account 
{
	public static void main(String[] args)throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//a[.='Create New Account']")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Shashank");
		driver.findElement(By.xpath("//input[@aria-label='Surname']")).sendKeys("K");
		driver.findElement(By.xpath("//input[@aria-label='Mobile number or email address']")).sendKeys("7760327297");
		driver.findElement(By.xpath("//input[@aria-label='New password']")).sendKeys("shashu@1234");
		WebElement dayDrop=driver.findElement(By.xpath("//select[@id='day']"));
		Select day=new Select(dayDrop);
		day.selectByVisibleText("20");
		WebElement monthdrop=driver.findElement(By.xpath("//select[@id='month']"));
		Select month=new Select(monthdrop);
		month.selectByIndex(11);
		WebElement yeardrop=driver.findElement(By.xpath("//select[@id='year']"));
		Select year=new Select(yeardrop);
		year.selectByVisibleText("1998");
		driver.findElement(By.xpath("//label[.='Male']")).click();
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();
		
	}
}
