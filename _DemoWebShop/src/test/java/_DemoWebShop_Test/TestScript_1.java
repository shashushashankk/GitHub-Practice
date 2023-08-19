package _DemoWebShop_Test;

import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import _DemoWebShop_Generics.BaseClass;

public class TestScript_1 extends BaseClass {
	@Test
	public void main() {

		WebElement register_btn = driver.findElement(By.xpath("//a[@class='ico-register']"));
		register_btn.click();
		WebElement Gen_btn = driver.findElement(By.xpath("//input[@id='gender-male']"));
		Gen_btn.click();
		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Shashank");
		driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("K");
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("shashankkshetty2000@gmail.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Shashu@123");
		driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("Shashu@123");
		driver.findElement(By.xpath("//input[@value='Register']")).click();
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
		driver.findElement(By.xpath("//a[.='Log in']")).click();
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("shashankkshetty2000@gmail.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Shashu@123");
		driver.findElement(By.xpath("//input[@id='RememberMe']")).click();
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		WebElement logout = driver.findElement(By.xpath("//a[.='Log out']"));

		if (logout.isDisplayed()) {
			System.out.println("User Able to Login succesfully");
		} else {
			System.out.println("User notable to Login succesfully");
		}

	}

}
