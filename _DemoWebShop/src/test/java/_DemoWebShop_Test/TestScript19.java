package _DemoWebShop_Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.DemoWebShop.Generic.BaseClass;

public class TestScript19 extends BaseClass {
	String testData = "Product review is successfully added.";

	@Test
	public void addProductReview() {
		SoftAssert sa = new SoftAssert();
		driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("Create Your Own Jewelry");
		driver.findElement(By.xpath("//input[@class='button-1 search-box-button']")).click();
		driver.findElement(By.xpath("//a[.='Create Your Own Jewelry']")).click();
		driver.findElement(By.xpath("//a[.='Add your review']")).click();
		driver.findElement(By.xpath("//input[@class='review-title']")).sendKeys("Jewelry");
		driver.findElement(By.xpath("//textarea[@class='review-text']")).sendKeys("Jewelry is mgood");
		driver.findElement(By.xpath("//input[@checked='checked']")).click();
		driver.findElement(By.xpath("//input[@name='add-review']")).click();
		WebElement con_msg = driver.findElement(By.xpath("//div[@class='result']"));
		sa.assertEquals(con_msg.getText(), testData, "Product review is not added");
		sa.assertAll();
		Reporter.log("Product review is successfully added", true);
	}

}
