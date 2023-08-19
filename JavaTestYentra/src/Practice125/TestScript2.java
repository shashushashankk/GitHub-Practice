package Practice125;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TestScript2 {
	@Test(groups = "regression")
	public void sample() {
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
		driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("Health Book",Keys.ENTER);
		driver.findElement(By.xpath("//a[.='Health Book']/../../div[3]/div[2]/input")).click();
		driver.findElement(By.xpath("//span[.='Shopping cart']")).click();
		WebElement Con_drp=driver.findElement(By.xpath("//select[@id='CountryId']"));
		Select sel=new Select(Con_drp);
		sel.selectByVisibleText("India");
		WebElement Sta_drp=driver.findElement(By.xpath("//select[@id='StateProvinceId']"));
		Select sel1=new Select(Sta_drp);
		sel1.selectByVisibleText("Other (Non US)");
		driver.findElement(By.xpath("//input[@id='ZipPostalCode']")).sendKeys("577179");
		driver.findElement(By.xpath("//input[@name='estimateshipping']")).click();
		WebElement info=driver.findElement(By.xpath("(//span[@class='option-description'])[1]"));
		if (info.isDisplayed()) {
			System.out.println("Information is Displayed");
		}
		else {
			System.out.println("Information is not displaying");
		}
		driver.quit();
	}
}
