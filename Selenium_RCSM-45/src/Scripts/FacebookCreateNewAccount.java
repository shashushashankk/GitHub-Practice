package Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookCreateNewAccount 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.facebook.com");
		WebElement CreateButton=driver.findElement(By.xpath("//a[.='Create New Account']"));
		if (CreateButton.isDisplayed()) 
		{
			if(CreateButton.isEnabled())
			{
				CreateButton.click();
			}
			else
			{
				System.out.println("NOT ENABLED");
			}
		}
		else
		{
			System.out.println("NOT DISABLED");
		}
		Thread.sleep(5000);
		WebElement MRadio= driver.findElement(By.xpath("//label[.='Male']/following-sibling::input"));
		if (MRadio.isDisplayed())
		{
			if (MRadio.isEnabled()) 
			{
				MRadio.click();
				if (MRadio.isSelected()) 
				{
					System.out.println("Selected");
				}
				else
				{
					System.out.println("Not Selected");
				}
			}
			else
			{
				System.out.println("Not Enabled");
			}
		}
		else
		{
			System.out.println("Not Enabled");
		}
	}
}
