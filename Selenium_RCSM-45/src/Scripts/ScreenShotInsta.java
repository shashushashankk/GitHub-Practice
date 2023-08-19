package Scripts;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;


public class ScreenShotInsta 
{
	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.navigate().to("https://www.instagram.com");
		driver.manage().window().maximize();
		TakesScreenshot ssc = (TakesScreenshot)driver;
		File src =ssc.getScreenshotAs(OutputType.FILE);
		File per=new File("./Screenshot/Instahomepage.jpeg");
		if(per.createNewFile())
		{
			FileHandler.copy(src, per);
		}
	}

}
