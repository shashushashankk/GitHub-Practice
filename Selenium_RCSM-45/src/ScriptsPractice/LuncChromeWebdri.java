package ScriptsPractice;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class LuncChromeWebdri 
{
	public static void main(String[] args) throws InterruptedException 
	{
		String key="webdriver.chrome.driver";
		String value="./Softwares/chromedriver.exe";
		System.setProperty(key, value);
		RemoteWebDriver driver =new FirefoxDriver();
		driver.close();
		driver.wait();
		driver.findElement(null);
		driver.findElements(null);
		driver.get(value);
		driver.getTitle();
		driver.getCurrentUrl();
		driver.getPageSource();
		driver.getWindowHandle();
		driver.getWindowHandles();
		driver.manage();
		driver.navigate();
		driver.switchTo();
	} 
}
