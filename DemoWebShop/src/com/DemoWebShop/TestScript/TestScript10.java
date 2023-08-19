package com.DemoWebShop.TestScript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.DemoWebShop.Generic.BaseClass;

public class TestScript10 extends BaseClass{
	@Test
	public void main() {
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
	}

}
