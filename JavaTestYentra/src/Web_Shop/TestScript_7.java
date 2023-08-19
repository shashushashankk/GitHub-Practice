package Web_Shop;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScript_7 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[.='Log in']")).click();
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("shashankkshetty2000@gmail.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Shashu@123");
		driver.findElement(By.xpath("//input[@id='RememberMe']")).click();
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		driver.findElement(By.xpath("//a[.='Compare products list']")).click();
		//WebElement clr_btn= driver.findElement(By.xpath("//a[.='Clear list']"));
		driver.findElement(By.xpath("//ul[@class='top-menu']/li[6]")).click();
		driver.findElement(By.xpath("(//div[@class='picture'])[2]")).click();
		driver.findElement(By.xpath("//input[@value='Add to compare list']")).click();
		driver.findElement(By.xpath("//ul[@class='top-menu']/li[2]")).click();
		driver.findElement(By.xpath("//a[contains(.,'Notebooks') and @title='Show products in category Notebooks']")).click();
		driver.findElement(By.xpath("//h2[@class='product-title']")).click();
		driver.findElement(By.xpath("//input[@value='Add to compare list']")).click();
		WebElement tab= driver.findElement(By.xpath("//table[@class='compare-products-table']"));
		if (tab.isDisplayed()) {
			System.out.println("Product is Displayed");
		}
		else {
			System.out.println("Test Script 7 Failed");
		}
		driver.quit();
	}
}
