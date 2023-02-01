package Selenium;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumGithubTest {
	@Test
	public  void main() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		driver.get("https://www.google.com");
		String Parent=  driver.getWindowHandle();
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.youtube.com");
		String Youtube=driver.getWindowHandle();
		driver.manage().window().maximize();
		driver.switchTo().window(Parent);
		driver.get("https://www.selenium.dev/");
		
		wait.until(ExpectedConditions.titleIs(driver.getTitle()));
		driver.manage().window().minimize();
		driver.findElement(By.xpath("//a[@aria-label='GitHub']")).click();
		String tab = driver.getWindowHandle();
		Set<String> tablist = driver.getWindowHandles();
		tablist.remove(tab);
		tablist.remove(Youtube);
		
		for (String a : tablist) {
			driver.switchTo().window(a);
			System.out.println(driver.getTitle());
		}
		driver.findElement(By.xpath("//a[contains(.,'Sign in')]")).click();
		driver.quit();

	}

}
