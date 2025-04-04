package Web_Shop;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScript16 {

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
		driver.findElement(By.xpath("//a[.='New products']")).click();
		driver.findElement(By.xpath("//a[.='Phone Cover']/../following-sibling::div[2]/div[2]/input")).click();
		driver.findElement(By.xpath("//input[@id='add-to-cart-button-80']")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("//a[.='Simple Computer']/../following-sibling::div[3]/div[2]/input")).click();
		driver.findElement(By.xpath("//label[contains(.,'Processor')]/../../dd[1]/ul/li/input")).click();
		driver.findElement(By.xpath("//label[contains(.,'Software')]/../../dd[4]/ul/li[1]/input")).click();
		driver.findElement(By.xpath("//input[@class='button-1 add-to-cart-button']")).click();
		driver.findElement(By.xpath("//span[.='Shopping cart']")).click();
		List<WebElement> rmv_cart_btns=driver.findElements(By.xpath("//input[@name='removefromcart']"));
		for(WebElement rmv_btn: rmv_cart_btns) {
			rmv_btn.click();
		}
		driver.findElement(By.xpath("//input[@name='updatecart']")).click();
		WebElement con_msg = driver.findElement(By.xpath("//div[contains(.,'Your Shopping') and @class='order-summary-content']"));
		if (con_msg.isDisplayed()) {
			System.out.println(con_msg.getText());
		}
		else {
			System.out.println("test Script 16 failed");
		}
		driver.quit();
	}

}
