package _DemoWebShop_Generics;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public WebDriver driver;

	@BeforeClass
	public void launchBrowsere() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.get("https://demowebshop.tricentis.com/");
		Reporter.log("url launched", true);
	}

	@BeforeMethod
	public void login() {
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("shashankkshetty2000@gmail.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Shashu@123");
		driver.findElement(By.xpath("//input[@id='RememberMe']")).click();
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		Reporter.log("Application logedin", true);
	}

	/*
	 * @AfterMethod public void logout() { Reporter.log("Application Loggedout",
	 * true); driver.findElement(By.xpath("//a[.='Log out']")).click();
	 * Reporter.log("Application Loggedout", true); }
	 * 
	 * @AfterClass public void closeBrowser() { Reporter.log("Browser closed",
	 * true); driver.quit(); }
	 */

}
