package com.DemoWebShop.TestScript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.DemoWebShop.Generic.BaseClass;

public class TestScript15 extends BaseClass{
	@Test
	public void main() {
		driver.findElement(By.xpath("//ul[@class='top-menu']/li/a[contains(.,'Apparel')]")).click();
		driver.findElement(By.xpath("(//h2[@class='product-title'])[1]")).click();
		driver.findElement(By.xpath("//input[@id='add-to-wishlist-button-5']")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("(//h2[@class='product-title'])[2]")).click();
		driver.findElement(By.xpath("//input[@id='add-to-wishlist-button-28']")).click();
		driver.findElement(By.xpath("//span[.='Wishlist']")).click();
		driver.findElement(By.xpath("(//td[@class='product']/preceding-sibling::td[3])[1]")).click();
		driver.findElement(By.xpath("//input[@name='updatecart']")).click();
		driver.findElement(By.xpath("//a[.='Blue and green Sneaker']/../preceding-sibling::td[2]/input")).click();
		driver.findElement(By.xpath("//input[@name='addtocartbutton']")).click();
		driver.findElement(By.xpath("//span[.='Shopping cart']")).click();
		WebElement prdct= driver.findElement(By.xpath("(//a[.='Blue and green Sneaker'])[2]"));
		if (prdct.isDisplayed()) {
			System.out.println("product is displayed in cart page");
		}
		else {
			System.out.println("Test Script 15 failed");
		}
	}
}
