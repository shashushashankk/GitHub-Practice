package Web_Shop;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScript_9 {

	public static void main(String[] args) {
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
		driver.findElement(By.xpath("//a[.='My account']")).click();
		driver.findElement(By.xpath("//a[.='Customer info']")).click();
		WebElement LN_txt = driver.findElement(By.xpath("//input[@id='LastName']"));
		LN_txt.sendKeys(Keys.CONTROL, "a");
		LN_txt.sendKeys("Shetty");
		driver.findElement(By.xpath("//input[@name='save-info-button']")).click();
		driver.navigate().refresh();
		String lst_name = LN_txt.getAttribute("value");
		if (lst_name.equals(lst_name)) {
			System.out.println("Test Script 9 is pass");
		} else {
			System.out.println("Test script 9 failed");
		}
		driver.quit();
	}

}
