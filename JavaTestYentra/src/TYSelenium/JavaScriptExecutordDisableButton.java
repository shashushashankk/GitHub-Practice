package TYSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

public class JavaScriptExecutordDisableButton {
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
			ChromeDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			driver.get("https://www.oracle.com/java/technologies/downloads/");
			driver.findElement(By.linkText("jdk-8u361-linux-aarch64.tar.gz")).click();
			WebElement disable_botton = driver.findElement(By.linkText("Download jdk-8u361-linux-aarch64.tar.gz"));
			JavascriptExecutor jse=(JavascriptExecutor) driver;
			jse.executeScript("arguments[0].click();", disable_botton);
			Reporter.log("paas",true);
		}
}
