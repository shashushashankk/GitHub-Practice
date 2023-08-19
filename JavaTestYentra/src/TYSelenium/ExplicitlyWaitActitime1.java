package TYSelenium;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.io.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ExplicitlyWaitActitime1 
{
	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost/login.do");
		WebDriverWait wait =new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("username")))).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		wait.until(ExpectedConditions.elementToBeClickable(By.id("loginButton"))).click();
		TakesScreenshot tss=(TakesScreenshot)driver;
		File temp = tss.getScreenshotAs(OutputType.FILE);
		File per=new File("./Screenshot/Actitime.jpeg");
		FileHandler.copy(temp, per);
		driver.quit();	
	}
}
