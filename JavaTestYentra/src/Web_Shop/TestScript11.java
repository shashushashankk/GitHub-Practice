package Web_Shop;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScript11 {

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
		driver.findElement(By.xpath("//span[.='Shopping cart']")).click();
		List<WebElement> Rmv_checkBoxs = driver.findElements(By.xpath("//input[@name='removefromcart']"));
		for(WebElement a:Rmv_checkBoxs) {
			a.click();
		}
		driver.findElement(By.xpath("//input[@name='updatecart']")).click();
		driver.findElement(By.xpath("//a[.='Orders']")).click();
		driver.findElement(By.xpath("//input[@value='Details']")).click();
		driver.findElement(By.xpath("//input[@value='Re-order']")).click();
		WebElement pdct=driver.findElement(By.xpath("//tr[@class='cart-header-row']"));
		if (pdct.isDisplayed()) {
			System.out.println("Product is Displayed");
		}
		driver.close();
	}

}
