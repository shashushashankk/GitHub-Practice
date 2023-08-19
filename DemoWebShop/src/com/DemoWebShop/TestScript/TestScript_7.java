package com.DemoWebShop.TestScript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.DemoWebShop.Generic.BaseClass;

public class TestScript_7 extends BaseClass{
	@Test
	public  void main() {
		driver.findElement(By.xpath("//a[.='Compare products list']")).click();
		//WebElement clr_btn= driver.findElement(By.xpath("//a[.='Clear list']"));
		driver.findElement(By.xpath("//ul[@class='top-menu']/li[6]")).click();
		driver.findElement(By.xpath("(//div[@class='picture'])[2]")).click();
		driver.findElement(By.xpath("//input[@value='Add to compare list']")).click();
		driver.findElement(By.xpath("//ul[@class='top-menu']/li[2]")).click();
		driver.findElement(By.xpath("//a[contains(.,'Notebooks') and @title='Show products in category Notebooks']")).click();
		driver.findElement(By.xpath("//h2[@class='product-title']")).click();
		driver.findElement(By.xpath("//input[@value='Add to compare list']")).click();
		WebElement tab= driver.findElement(By.xpath("//table[@class='compare-products-table']"));
		if (tab.isDisplayed()) {
			System.out.println("Product is Displayed");
		}
		else {
			System.out.println("Test Script 7 Failed");
		}
	}
}
