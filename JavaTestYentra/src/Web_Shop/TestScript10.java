package Web_Shop;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScript10 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[.='Log in']")).click();
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("shashankkshetty2000@gmail.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Shashu@123");
		driver.findElement(By.xpath("//input[@id='RememberMe']")).click();
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		driver.findElement(By.xpath("//ul[@class='top-menu']/li/a[contains(.,'Cards')]")).click();
		driver.findElement(By.xpath("//a[.='My account']")).click();
		driver.findElement(By.xpath("(//a[.='Addresses'])[1]")).click();
		driver.findElement(By.xpath("//input[@class='button-2 edit-address-button']")).click();
		WebElement cmpny_txt = driver.findElement(By.xpath("//input[@id='Address_Company']"));
		cmpny_txt.sendKeys(Keys.CONTROL,"a");
		cmpny_txt.sendKeys("flipkart");
		driver.findElement(By.xpath("//input[@class='button-1 save-address-button']")).click();
		WebElement nme_chnd = driver.findElement(By.xpath("//li[@class='company' and .='flipkart']"));
		if (nme_chnd.isDisplayed()) {
			System.out.println("Company is changed");
		}
		else {
			System.out.println("Test Script 10 fails");
		}
		driver.quit();
	}

}
