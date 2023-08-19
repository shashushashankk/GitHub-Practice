package TYSelenium;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Snowcity {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://snowcityblr.com/contact-us/");
		WebElement frameadd=driver.findElement(By.xpath("//iframe[@referrerpolicy='no-referrer-when-downgrade']"));
		driver.switchTo().frame(frameadd);
		driver.findElement(By.xpath("//div[.='Directions']")).click();
		String parentWindow = driver.getWindowHandle();
		Set<String> Windows=driver.getWindowHandles();
		Windows.remove(parentWindow);
		for(String _2ndwindow:Windows ) {
			driver.switchTo().window(_2ndwindow);
		}
		WebElement fromloc = driver.findElement(By.xpath("//input[@tooltip='Choose starting point, or click on the map...']"));
		fromloc.sendKeys(Keys.SHIFT,"shashu");
		fromloc.sendKeys(Keys.CONTROL, "ac");
		//driver.findElement(By.xpath("(//div[@role='combobox'])[2]")).sendKeys(Keys.CONTROL,"v");
	}
	
	

}
