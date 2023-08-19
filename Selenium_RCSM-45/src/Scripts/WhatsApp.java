package Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WhatsApp {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		FirefoxDriver driver =new FirefoxDriver();
		driver.get("file:///C:/Users/Shashank%20Shetty/Desktop/Q%20spider/Selenium/HTML/DateofBirth.html");
		Thread.sleep(3000);
		WebElement f= driver.findElement(By.name("shashank"));
		f.click();
		f.click();
		f.click();
	}
}
