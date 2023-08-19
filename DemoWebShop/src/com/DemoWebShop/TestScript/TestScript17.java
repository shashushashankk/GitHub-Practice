package com.DemoWebShop.TestScript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.DemoWebShop.Generic.BaseClass;

public class TestScript17 extends BaseClass{
	@Test
	public void main() {
		driver.findElement(By.xpath("//a[.='Search']")).click();
		driver.findElement(By.xpath("//input[@id='Q']")).sendKeys("Casual Golf Belt");
		driver.findElement(By.xpath("//input[@id='As']")).click();
		WebElement cat_drp=driver.findElement(By.xpath("//select[@id='Cid']"));
		Select sel1=new Select(cat_drp);
		sel1.selectByValue("10");
		driver.findElement(By.xpath("//input[@id='Isc']")).click();
		WebElement Man_drp=driver.findElement(By.xpath("//select[@id='Mid']"));
		Select sel2=new Select(Man_drp);
		sel2.selectByVisibleText("All");
		driver.findElement(By.xpath("//input[@id='Pf']")).sendKeys("1");
		driver.findElement(By.xpath("//input[@id='Pt']")).sendKeys("50");
		driver.findElement(By.xpath("//input[@id='Sid']")).click();
		driver.findElement(By.xpath("//input[@class='button-1 search-button']")).click();
		WebElement prdct=driver.findElement(By.xpath("//a[.='Casual Golf Belt']"));
		if (prdct.isDisplayed()) {
			System.out.println("product is displayed");
		}
	}

}
