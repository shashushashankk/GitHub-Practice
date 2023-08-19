package Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FaceookLogin 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.faceook.com");
		driver.findElement(By.name("email")).sendKeys("shashank2000@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("shashakk@123");
		driver.findElement(By.name("login")).click();
	}

}
