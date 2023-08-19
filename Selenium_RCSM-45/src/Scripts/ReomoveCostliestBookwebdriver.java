package Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class ReomoveCostliestBookwebdriver {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com");
		driver.findElement(By.xpath("//a[.='Log in']")).click();
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("shashankkshetty2000@gmail.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Shashu@1234");
		driver.findElement(By.xpath("//input[@id='RememberMe']")).click();
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		driver.findElement(By.xpath("//ul[@class='top-menu']/li[1]/a")).click();
		driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("Computing and Internet");
		driver.findElement(By.xpath("//input[@class='button-1 search-box-button']")).click();
		driver.findElement(By.xpath("//a[.='Computing and Internet']/../../div[3]/div[2]/input")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("Fiction");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='button-1 search-box-button']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='Fiction']/../../div[3]/div[2]/input")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[.='Shopping cart']")).click();
		Thread.sleep(2000);
		Thread.sleep(2000);
		WebElement Computing = driver.findElement(By.xpath(
				"//a[.='Computing and Internet' and @class='product-name']/../following-sibling::td[1]/span[2]"));
		Thread.sleep(2000);
		String Comp_Price = Computing.getText();
		WebElement Fiction = driver.findElement(
				By.xpath("//a[.='Fiction' and @class='product-name']/../following-sibling::td[1]/span[2]"));
		Thread.sleep(2000);
		String Fict_Price = Fiction.getText();
		Thread.sleep(2000);
		double Compu_Price=Double.parseDouble(Comp_Price);
		Thread.sleep(2000);
		double Fic_Price = Double.parseDouble(Fict_Price);
		if (Compu_Price>Fic_Price)
		{
			driver.findElement(By.xpath("//a[.='Computing and Internet' and @class='product-name']/../../td[1]/input")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@value='Update shopping cart']")).click();
		}
		else 
		{
			driver.findElement(By.xpath("//a[.='Fiction' and @class='product-name']/../../td[1]/input")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@value='Update shopping cart']")).click();
		}
	
		

	}
}
