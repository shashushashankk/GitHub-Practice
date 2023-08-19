package Web_Shop;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestScript_1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		WebDriverWait wait= new WebDriverWait(driver, 60);
		WebElement register_btn = driver.findElement(By.xpath("//a[@class='ico-register']"));
		wait.until(ExpectedConditions.elementToBeClickable(register_btn));
		register_btn.click();
		WebElement Gen_btn = driver.findElement(By.xpath("//input[@id='gender-male']"));
		Gen_btn.click();
		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Shashank");
		driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("K");
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("shashankkshetty2000@gmail.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Shashu@123");
		driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("Shashu@123");
		driver.findElement(By.xpath("//input[@value='Register']")).click();
		//driver.findElement(By.xpath("//input[@value='Continue']")).click();
		driver.findElement(By.xpath("//a[.='Log in']")).click();
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("shashankkshetty2000@gmail.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Shashu@123");
		driver.findElement(By.xpath("//input[@id='RememberMe']")).click();
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		WebElement logout=driver.findElement(By.xpath("//a[.='Log out']"));
		if(logout.isDisplayed()) {
			System.out.println("User Able to Login succesfully");
		}
		else {
			System.out.println("User notable to Login succesfully");
		}
		driver.quit();
	}

}
