package com.DemoWebShop.TestScript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.DemoWebShop.Generic.BaseClass;

public class TestScript_3 extends BaseClass{
	@Test
	public void main() {
		driver.findElement(By.xpath("//ul[@class='top-menu']/li[2]/a")).click();
		driver.findElement(By.xpath("//h1[.='Computers']/../../div[2]/div[1]/div[1]/div[1]/h2")).click();
		WebElement sort_by = driver.findElement(By.xpath("//select[@id='products-orderby']"));
		Select sel1 = new Select(sort_by);
		sel1.selectByVisibleText("Name: Z to A");
		WebElement Display = driver.findElement(By.xpath("//select[@id='products-pagesize']"));
		Select sel2 = new Select(Display);
		sel2.selectByVisibleText("12");
		WebDriverWait wait = new WebDriverWait(driver, 60);
		WebElement view_as = driver.findElement(By.xpath("//select[@name='products-viewmode']"));
		Select sel3 = new Select(view_as);
		wait.until(ExpectedConditions.visibilityOf(view_as));
		sel3.selectByVisibleText("List");
		driver.findElement(By.xpath("(//span[.='1200.00' and @class='PriceRange'])[2]")).click();
		driver.findElement(By.xpath("//a[.='Build your own computer']/../../div[3]/div[2]/input")).click();
		driver.findElement(By.xpath("//label[contains(.,'320 GB')]")).click();
		driver.findElement(By.xpath("//label[.='Qty:']/following-sibling::input[2]")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("//a[.='Build your own expensive computer']/../../div[3]/div[2]/input")).click();
		driver.findElement(By.xpath("//label[contains(.,'Software')]/../../dd[4]/ul/li[1]")).click();
		driver.findElement(By.xpath("//label[.='Qty:']/following-sibling::input[2]")).click();
		driver.findElement(By.xpath("//span[.='Shopping cart']")).click();
		driver.findElement(By.xpath("//span[.='(read)']")).click();
		driver.findElement(By.xpath("//input[@id='termsofservice']")).click();
		driver.findElement(By.xpath("//button[contains(.,'Checkout')]")).click();
		WebElement Add_Drp = driver.findElement(By.xpath("//select[@id='billing-address-select']"));
		Select sel11 = new Select(Add_Drp);
		sel11.selectByVisibleText("New Address");
		driver.findElement(By.xpath("//input[@name='BillingNewAddress.FirstName']")).sendKeys("Shashank");
		driver.findElement(By.xpath("//input[@name='BillingNewAddress.LastName']")).sendKeys("K");
		WebElement email = driver.findElement(By.xpath("//input[@name='BillingNewAddress.Email']"));
		email.sendKeys(Keys.CONTROL, "a");
		email.sendKeys("shashankkshetty2000@gmail.com");
		driver.findElement(By.xpath("//input[@name='BillingNewAddress.Company']")).sendKeys("Test Yantra");
		driver.findElement(By.xpath("//select[@id='BillingNewAddress_CountryId']")).click();
		WebElement Coun_Drp = driver.findElement(By.xpath("//select[@id='BillingNewAddress_CountryId']"));
		Select sel12 = new Select(Coun_Drp);
		sel12.selectByVisibleText("India");
		WebElement State_Drp = driver.findElement(By.xpath("//select[@id='BillingNewAddress_StateProvinceId']"));
		Select sel13 = new Select(State_Drp);
		sel13.selectByValue("0");
		driver.findElement(By.xpath("//input[@id='BillingNewAddress_City']")).sendKeys("Begaluru");
		driver.findElement(By.xpath("//input[@id='BillingNewAddress_Address1']")).sendKeys("4th block");
		driver.findElement(By.xpath("//input[@id='BillingNewAddress_Address2']")).sendKeys("Rajajinagar");
		driver.findElement(By.xpath("//input[@id='BillingNewAddress_ZipPostalCode']")).sendKeys("560010");
		driver.findElement(By.xpath("//input[@id='BillingNewAddress_PhoneNumber']")).sendKeys("7760327999");
		driver.findElement(By.xpath("//input[@id='BillingNewAddress_FaxNumber']")).sendKeys("123456789");
		driver.findElement(By.xpath("//input[@onclick='Billing.save()']")).click();
		driver.findElement(By.xpath("//input[@onclick='Shipping.save()']")).click();
		driver.findElement(By.xpath("//input[@id='shippingoption_1']")).click();
		driver.findElement(By.xpath("//input[@onclick='ShippingMethod.save()']")).click();
		driver.findElement(By.xpath("//input[@id='paymentmethod_0']")).click();
		driver.findElement(By.xpath("//input[@onclick='PaymentMethod.save()']")).click();
		driver.findElement(By.xpath("//input[@onclick='PaymentInfo.save()']")).click();
		driver.findElement(By.xpath("//input[@onclick='ConfirmOrder.save()']")).click();
		WebElement Con_msg = driver.findElement(By.xpath("//strong[.='Your order has been successfully processed!']"));
		if (Con_msg.isDisplayed()) {
			System.out.println(Con_msg.getText());
		} else {
			System.out.println("Testy Script fail");
		}
	}
}