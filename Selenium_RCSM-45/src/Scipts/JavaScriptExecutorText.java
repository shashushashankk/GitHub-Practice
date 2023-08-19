package Scipts;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorText {
	public static void main(String[] args) throws InterruptedException {
		JavascriptexecutorScrollbar.main(null);
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("file:///C:/Users/Shashank%20Shetty/Desktop/Q%20spider/Selenium/HTML/DisabledText.html");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("document.getElementById('a1').value='hii'");
		js.executeScript("document.getElementById('a1').click()");
		System.out.println("hiii");
		driver.close();
	}
}