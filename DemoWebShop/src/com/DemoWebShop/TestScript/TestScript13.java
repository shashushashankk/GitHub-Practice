package com.DemoWebShop.TestScript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.DemoWebShop.Generic.BaseClass;

public class TestScript13 extends BaseClass{
	@Test
	public void main() {
		
		driver.findElement(By.xpath("//input[@name='NewsletterEmail']")).sendKeys("shashankkshetty2000@gmail.com");
		driver.findElement(By.xpath("//input[@id='newsletter-subscribe-button']")).click();
		WebElement con_msg=driver.findElement(By.xpath("//div[contains(.,'Thank you') and @class='listbox']"));
		if (con_msg.isDisplayed()) {
			System.out.println(con_msg.getText());
		}
		else {
			System.out.println("Test Script 13 failed");
		}
	}
}
