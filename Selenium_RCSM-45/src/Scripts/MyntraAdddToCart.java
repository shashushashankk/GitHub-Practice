package Scripts;

import java.util.Set;

import javax.swing.text.TabableView;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyntraAdddToCart 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		Thread.sleep(5000);
		driver.get("https://www.myntra.com");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@class='desktop-searchBar']")).sendKeys("Mens leather purse");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@class='desktop-submit']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//ul[@class='results-base']/li[1]")).click();
		Thread.sleep(5000);
		//driver.close();
		//driver.findElement(By.xpath("//div[@class='size-buttons-size-header']/../div[2]/div[1]/div[1]/button/span")).click();
		//driver.getWindowHandles().forEach(tab->driver.switchTo().window(tab));
		String tab = driver.getWindowHandle();
		Set<String> tabs = driver.getWindowHandles();
		tabs.remove(tab);
		for(String a: tabs) {
			driver.switchTo().window(a);
		}
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[contains(text(),'WISHLIST')]/../../div[1]/span")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[.='Bag']")).click();
		WebElement cart= driver.findElement(By.xpath("//a[contains(text(),' Wallet')]"));
		if(cart.isDisplayed())
		{
				System.out.println("is displayed");
		}
		else
		{
			System.out.println("not Displayed");
		}
		
	}
}
