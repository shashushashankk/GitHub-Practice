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

public class TestScript_2 extends BaseClass {
	@Test
	public  void main() {
		driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("Health Book",Keys.ENTER);
		driver.findElement(By.xpath("//a[.='Health Book']/../../div[3]/div[2]/input")).click();
		driver.findElement(By.xpath("//span[.='Shopping cart']")).click();
		WebElement Con_drp=driver.findElement(By.xpath("//select[@id='CountryId']"));
		Select sel=new Select(Con_drp);
		sel.selectByVisibleText("India");
		WebElement Sta_drp=driver.findElement(By.xpath("//select[@id='StateProvinceId']"));
		Select sel1=new Select(Sta_drp);
		sel1.selectByVisibleText("Other (Non US)");
		driver.findElement(By.xpath("//input[@id='ZipPostalCode']")).sendKeys("577179");
		driver.findElement(By.xpath("//input[@name='estimateshipping']")).click();
		WebElement info=driver.findElement(By.xpath("(//span[@class='option-description'])[1]"));
		if (info.isDisplayed()) {
			System.out.println("Information is Displayed");
		}
		else {
			System.out.println("Information is not displaying");
		}	
	}
}
