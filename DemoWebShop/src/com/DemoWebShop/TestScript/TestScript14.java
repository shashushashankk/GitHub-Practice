package com.DemoWebShop.TestScript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.DemoWebShop.Generic.BaseClass;

public class TestScript14 extends BaseClass{
	@Test
	public void main() {
		driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("Build your own computer");
		driver.findElement(By.xpath("//input[@class='button-1 search-box-button']")).click();
		driver.findElement(By.xpath("//h2[@class='product-title']")).click();
		WebElement processor = driver.findElement(By.xpath("//select[@id='product_attribute_16_5_4']"));
		Select sel1 = new Select(processor);
		sel1.selectByIndex(0);
		WebElement ram = driver.findElement(By.xpath("//select[@id='product_attribute_16_6_5']"));
		Select sel2 = new Select(ram);
		sel2.selectByValue("16");
		driver.findElement(By.xpath("//label[.='320 GB ']")).click();
		driver.findElement(By.xpath("//label[.='Windows 7  [+50.00]']")).click();
		driver.findElement(By.xpath("//label[.='Microsoft Office  [+50.00]']")).click();
		driver.findElement(By.xpath("//input[@id='add-to-cart-button-16']")).click();
		WebElement con_msg=driver.findElement(By.xpath("//p[@class='content']"));
		if (con_msg.isDisplayed()) {
			System.out.println(con_msg.getText());
		}
		else {
			System.out.println("Test Script 14 fialed");
		}
	}
}
