package com.DemoWebShop.TestScript;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.DemoWebShop.Generic.BaseClass;

public class TestScript_6 extends BaseClass {
	@Test
	public  void main() {
		driver.findElement(By.xpath("//span[.='Shopping cart']")).click();
		List<WebElement> Rmv_checkBoxs = driver.findElements(By.xpath("//input[@name='removefromcart']"));
		for(WebElement a:Rmv_checkBoxs) {
			a.click();
		}
		driver.findElement(By.xpath("//input[@name='updatecart']")).click();
		driver.findElement(By.xpath("//ul[@class='top-menu']/li[5]")).click();
		driver.findElement(By.xpath("//a[.='3rd Album']/../../div[3]/div[2]/input")).click();
		driver.findElement(By.xpath("(//input[@value='Add to cart'])[1]")).click();
		driver.findElement(By.xpath("//span[.='Shopping cart']")).click();
		driver.findElement(By.xpath("//input[@class='qty-input']")).sendKeys("5");
		driver.findElement(By.xpath("//input[@name='giftcardcouponcode']")).sendKeys("15364df69");
		driver.findElement(By.xpath("//input[@name='applygiftcardcouponcode']")).click();
		WebElement Err_msg = driver.findElement(By.xpath("//div[@class='message']"));
		if (Err_msg.isDisplayed()) {
			System.out.println(Err_msg.getText());
		}
		else {
			System.out.println("Test Script 6 fails");
		}
	}

}
