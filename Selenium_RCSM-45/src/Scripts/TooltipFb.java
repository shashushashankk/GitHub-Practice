package Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TooltipFb 
{
	public static void main(String[] args) 
	{
		String data="Kannada";
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		WebElement LangTooltip=driver.findElement(By.xpath("//a[.='ಕನ್ನಡ']"));
		String LangName= LangTooltip.getAttribute("title");
		if(LangName.equals(data))
		{
			System.out.println("Tooltip is displayed");
		}
		else
		{
			System.out.println("Tooltip is not displayed");
		}
	}
}
