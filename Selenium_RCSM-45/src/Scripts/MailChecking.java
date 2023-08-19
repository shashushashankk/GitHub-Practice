package Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MailChecking 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://in.search.yahoo.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@id='ysignin']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys("shashankk98@yahoo.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='login-signin']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='login-passwd']")).sendKeys("Shashu@123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='login-signin']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@title='Mail']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@rel='noopener' and @aria-label='Compose' ]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='message-to-field']")).sendKeys("krishnashetty98@yahoo.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Subject']")).sendKeys("Regarding Job Application");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@aria-label='Message body']")).sendKeys("Hi sir, I am shashank");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@title='Send this email']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@role='presentation']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@id='profile-signout-link']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@id='ysignin']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@class='pure-button puree-button-link add-account page-button-link']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys("krishnashetty98@yahoo.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='login-signin']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='login-passwd']")).sendKeys("Shashu@1234");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='login-signin']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@title='Mail']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href='/d/folders/1?.intl=in&.lang=en-IN&pspid=2114723002&activity=header-mail']")).click();
	}

}
