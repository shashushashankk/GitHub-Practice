package TYSelenium;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleMultipleWindow {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/Shashank%20Shetty/Downloads/MultipleWindow(1).html");
		driver.findElement(By.xpath("//input[@type='button']")).click();
		Set<String> windowhandles = driver.getWindowHandles();
		for(String handle: windowhandles) {
			Thread.sleep(5000);
			driver.switchTo().window(handle);
			driver.close();
		}
	}
}
