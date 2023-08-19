package TYSelenium;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumGitHu {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		driver.findElement(By.xpath("//a[@aria-label='GitHub']")).click();
		@SuppressWarnings("unused")
		WebDriverWait wait=new WebDriverWait(driver, 10);
		String tab = driver.getWindowHandle();
		Set<String> tablist = driver.getWindowHandles();
		tablist.remove(tab);
		for(String a:tablist) {
			driver.switchTo().window(a);
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
			System.out.println(driver.getPageSource());
		}	
		driver.findElement(By.xpath("//a[contains(.,'Sign in')]")).click();
		driver.close();
		
		}

}
