package Web_Shop;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestScript_4 extends BaseClass{
	@Test
	public static void main(WebDriver driver) {

		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[.='Log in']")).click();
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("shashankkshetty2000@gmail.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Shashu@123");
		driver.findElement(By.xpath("//input[@id='RememberMe']")).click();
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();

		driver.findElement(By.xpath("//ul[@class='top-menu']/li[3]/a")).click();
		driver.findElement(
				By.xpath("//a[contains(.,'Cell phones') and @title='Show products in category Cell phones']")).click();
		driver.findElement(By.xpath("(//a[.='Smartphone'])[2]")).click();
		driver.findElement(By.xpath("//input[@name='addtocart_43.EnteredQuantity']")).sendKeys("2");
		driver.findElement(By.xpath("//input[@id='add-to-wishlist-button-43']")).click();
		driver.findElement(By.xpath("//span[.='Wishlist']")).click();
		driver.findElement(By.xpath("//input[@name='removefromcart']")).click();
		driver.findElement(By.xpath("//input[@name='updatecart']")).click();
		WebElement con_msg = driver.findElement(By.xpath("//div[@class='wishlist-content']"));
		if (con_msg.isDisplayed()) {
			System.out.println(con_msg.getText());
		} else {
			System.out.println("Testcase 4 failed");
		}
		//driver.quit();
	}

}
