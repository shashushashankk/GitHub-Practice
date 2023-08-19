package TYSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AlertHa {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Actions act = new Actions(driver);
		Thread.sleep(2000);
		WebElement right_btn = driver.findElement(By.xpath("//span[.='right click me']"));
		Thread.sleep(2000);
		act.contextClick(right_btn).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//ul[@class='context-menu-list context-menu-root']/li[1]")).click();
		Alert handle = driver.switchTo().alert();
		Thread.sleep(2000);
		handle.accept();
		act.contextClick(right_btn).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//ul[@class='context-menu-list context-menu-root']/li[2]")).click();
		Alert handle1 = driver.switchTo().alert();
		Thread.sleep(2000);
		handle.accept();

		act.contextClick(right_btn).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//ul[@class='context-menu-list context-menu-root']/li[3]")).click();
		Alert handle2 = driver.switchTo().alert();
		Thread.sleep(2000);
		handle.accept();

		act.contextClick(right_btn).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//ul[@class='context-menu-list context-menu-root']/li[4]")).click();
		Alert handle3 = driver.switchTo().alert();
		Thread.sleep(2000);
		handle.accept();

		act.contextClick(right_btn).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//ul[@class='context-menu-list context-menu-root']/li[5]")).click();
		Alert handle4 = driver.switchTo().alert();
		Thread.sleep(2000);
		handle.accept();

		act.contextClick(right_btn).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//ul[@class='context-menu-list context-menu-root']/li[7]")).click();
		Alert handle5 = driver.switchTo().alert();
		Thread.sleep(2000);
		handle.accept();

		WebElement dbl_click = driver.findElement(By.xpath("//button[@ondblclick='myFunction()']"));
		Thread.sleep(2000);
		act.doubleClick(dbl_click).perform();
		Alert handle7 = driver.switchTo().alert();
		Thread.sleep(2000);
		handle1.accept();
		driver.quit();
	}
}
