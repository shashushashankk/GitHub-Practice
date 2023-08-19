package Web_Shop;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestScript19 extends BaseClass {
	String testData="Product review is successfully added.";
	@Test
	public void addProductReview() {
		/*  
		 * System.setProperty("webdriver.chrome.driver",
		 * "./Softwares/chromedriver.exe"); WebDriver driver = new ChromeDriver();
		 * driver.manage().window().maximize();
		 * driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		 * driver.get("https://demowebshop.tricentis.com/");
		 * driver.findElement(By.xpath("//a[.='Log in']")).click();
		 * driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(
		 * "shashankkshetty2000@gmail.com");
		 * driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Shashu@123"
		 * ); driver.findElement(By.xpath("//input[@id='RememberMe']")).click();
		 * driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click
		 * ();
		 */
		SoftAssert sa=new SoftAssert();
		driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("Create Your Own Jewelry");
		driver.findElement(By.xpath("//input[@class='button-1 search-box-button']")).click();
		driver.findElement(By.xpath("//a[.='Create Your Own Jewelry']")).click();
		driver.findElement(By.xpath("//a[.='Add your review']")).click();
		driver.findElement(By.xpath("//input[@class='review-title']")).sendKeys("Jewelry");
		driver.findElement(By.xpath("//textarea[@class='review-text']")).sendKeys("Jewelry is mgood");
		driver.findElement(By.xpath("//input[@checked='checked']")).click();
		driver.findElement(By.xpath("//input[@name='add-review']")).click();
		WebElement con_msg = driver.findElement(By.xpath("//div[@class='result']"));
		sa.assertEquals(con_msg.getText(),testData, "Product review is not added");
		sa.assertAll();
		Reporter.log("Product review is successfully added",true);
		
	}

}
