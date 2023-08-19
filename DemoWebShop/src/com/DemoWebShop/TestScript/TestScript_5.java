package com.DemoWebShop.TestScript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.DemoWebShop.Generic.BaseClass;

public class TestScript_5 extends BaseClass{
	@Test
	public  void main() throws InterruptedException {
		driver.findElement(By.xpath("//ul[@class='top-menu']/li[4]")).click();
		WebElement next_btn= driver.findElement(By.xpath("//a[.='Next']"));
		/*
		 * Point nxt_loc = next_btn.getLocation(); JavascriptExecutor
		 * jse=(JavascriptExecutor)driver; int y = nxt_loc.getY(); Thread.sleep(2000);
		 * jse.executeScript("window.scrollBy(0,500)"); Thread.sleep(2000);
		 */
		next_btn.click();
		driver.findElement(By.xpath("(//h2[@class='product-title'])[1]")).click();
		WebElement size_drp = driver.findElement(By.xpath("//label[contains(.,'Size')]/../../dd/select"));
		Select sel1=new Select(size_drp);
		sel1.selectByValue("109");
		driver.findElement(By.xpath("//input[@value='Email a friend']")).click();
		driver.findElement(By.xpath("//input[@class='friend-email']")).sendKeys("sachinsy@gmail.com");
		driver.findElement(By.xpath("//input[@class='your-email']")).sendKeys(Keys.CONTROL,"a","shashankkshetty2000@gmail.com");
		driver.findElement(By.xpath("//textarea[@class='personal-message']")).sendKeys("This is good shirt");
		driver.findElement(By.xpath("//input[@name='send-email']")).click();
		WebElement con_msg=driver.findElement(By.xpath("//div[@class='result']"));
		if (con_msg.isDisplayed()) {
			System.out.println(con_msg.getText());
		}
		else {
			System.out.println("Test case 5 failed");
		}
	}

}
