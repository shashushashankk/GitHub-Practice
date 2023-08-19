package Scripts;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;


public class TakesScreenShots 
{


	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.faceook.com");
		TakesScreenshot tss=(TakesScreenshot)driver;
		 File src = tss.getScreenshotAs(OutputType.FILE);
		File Per =new File("./Screenshot/FbScreenshot.jpeg");
		FileHandler.copy(src, Per);

	}

}
