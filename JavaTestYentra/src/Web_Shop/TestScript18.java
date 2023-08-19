package Web_Shop;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestScript18 {

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
		driver.findElement(By.xpath("//a[.='Search']")).click();
		driver.findElement(By.xpath("//input[@id='Q']")).sendKeys("Casual Golf Belt");
		driver.findElement(By.xpath("//input[@id='As']")).click();
		WebElement cat_drp=driver.findElement(By.xpath("//select[@id='Cid']"));
		Select sel1=new Select(cat_drp);
		sel1.selectByValue("1");
		driver.findElement(By.xpath("//input[@id='Isc']")).click();
		WebElement Man_drp=driver.findElement(By.xpath("//select[@id='Mid']"));
		Select sel2=new Select(Man_drp);
		sel2.selectByVisibleText("All");
		driver.findElement(By.xpath("//input[@id='Pf']")).sendKeys("1");
		driver.findElement(By.xpath("//input[@id='Pt']")).sendKeys("50");
		driver.findElement(By.xpath("//input[@id='Sid']")).click();
		driver.findElement(By.xpath("//input[@class='button-1 search-button']")).click();
		WebElement prdct=driver.findElement(By.xpath("//strong[@class='result']"));
		if (prdct.isDisplayed()) {
			System.out.println(prdct.getText());
		}
		driver.quit();
	}

}
