package Scipts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptexecutorScrollbar {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://www.Amazon.in");
		JavascriptExecutor JS=(JavascriptExecutor) driver;
		
		for (int i = 0; i <3; i++) {
			Thread.sleep(2000);
			JS.executeScript("window.scrollBy(0,500)");
		}
		for (int i = 0; i < 3; i++) {
			Thread.sleep(2000);
			JS.executeScript("window.scrollBy(0,-300)");
		}
		System.out.println("Shashank");
		driver.quit();
	}
}
