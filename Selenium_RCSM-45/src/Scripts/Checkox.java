package Scripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Checkox 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		driver.get("file:///C:/Users/Shashank%20Shetty/Desktop/Q%20spider/Selenium/HTML/Checkox.html");
		List<WebElement> CheckBoxes = driver.findElements(By.xpath("//input"));
		for (int i = 0; i < CheckBoxes.size(); i++) 
		{
			WebElement Checkbox=CheckBoxes.get(i);
			Thread.sleep(500);
			Checkbox.click();
		} 
		for (int i= CheckBoxes.size()-1; i>=0; i--) 
		{
			WebElement Checkbox=CheckBoxes.get(i);
			Thread.sleep(500);
			Checkbox.click();
		}
	}

}
