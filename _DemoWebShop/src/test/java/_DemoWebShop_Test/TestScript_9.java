package _DemoWebShop_Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.DemoWebShop.Generic.BaseClass;

public class TestScript_9 extends BaseClass {
	@Test
	public void main() {
		driver.findElement(By.xpath("//a[.='My account']")).click();
		driver.findElement(By.xpath("//a[.='Customer info']")).click();
		WebElement LN_txt = driver.findElement(By.xpath("//input[@id='LastName']"));
		LN_txt.sendKeys(Keys.CONTROL, "a");
		LN_txt.sendKeys("Shetty");
		driver.findElement(By.xpath("//input[@name='save-info-button']")).click();
		driver.navigate().refresh();
		String lst_name = LN_txt.getAttribute("value");
		if (lst_name.equals(lst_name)) {
			System.out.println("Test Script 9 is pass");
		} else {
			System.out.println("Test script 9 failed");
		}
	}

}
