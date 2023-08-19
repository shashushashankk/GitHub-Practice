package _DemoWebShop_Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.DemoWebShop.Generic.BaseClass;

public class TestScript_8 extends BaseClass{
	@Test
	public  void main() {
		
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
	}

}
