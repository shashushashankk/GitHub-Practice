package Web_Shop;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScript_8 {

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
		driver.findElement(By.xpath("//a[.='$5 Virtual Gift Card']/../following-sibling::div[3]/div[2]/input")).click();
		driver.findElement(By.id("giftcard_1_RecipientName")).sendKeys("Sachin S Y");
		driver.findElement(By.id("giftcard_1_RecipientEmail")).sendKeys("sachinsy@gmail.com");
		driver.findElement(By.id("giftcard_1_Message")).sendKeys("Virtual gift card of worth 5$");
		driver.findElement(By.xpath("//input[@id='add-to-cart-button-1']")).click();
		driver.findElement(By.xpath("//span[.='Shopping cart']")).click();
		driver.findElement(By.xpath("//a[.='Edit']")).click();
		WebElement edit = driver.findElement(By.id("giftcard_1_RecipientName"));
		edit.sendKeys(Keys.CONTROL, "a");
		edit.sendKeys("sagar");
		driver.findElement(By.xpath("//input[@id='add-to-cart-button-1']")).click();
		driver.findElement(By.xpath("//span[.='Shopping cart']")).click();
		WebElement chnd_nm = driver.findElement(By.xpath("(//div[contains(.,'For: sagar') and @class='attributes'])[2]"));
		if (chnd_nm.isDisplayed()) {
			System.out.println("Name is Changed");
		}
		else {
			System.out.println("Test Script 8 failed");
		}
		driver.quit();
	}

}
