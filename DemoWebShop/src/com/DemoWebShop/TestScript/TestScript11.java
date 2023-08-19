package com.DemoWebShop.TestScript;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.DemoWebShop.Generic.BaseClass;

public class TestScript11 extends BaseClass{
	@Test
	public void main() {
		driver.findElement(By.xpath("//span[.='Shopping cart']")).click();
		List<WebElement> Rmv_checkBoxs = driver.findElements(By.xpath("//input[@name='removefromcart']"));
		for(WebElement a:Rmv_checkBoxs) {
			a.click();
		}
		driver.findElement(By.xpath("//input[@name='updatecart']")).click();
		driver.findElement(By.xpath("//a[.='Orders']")).click();
		driver.findElement(By.xpath("//input[@value='Details']")).click();
		driver.findElement(By.xpath("//input[@value='Re-order']")).click();
		WebElement pdct=driver.findElement(By.xpath("//tr[@class='cart-header-row']"));
		if (pdct.isDisplayed()) {
			System.out.println("Product is Displayed");
		}
	}

}
