package Scripts;

import org.openqa.selenium.chrome.ChromeDriver;

public class LanchEmptyChromeBrowser 
{
	public static void main(String[] args) 
	{
		String key="webdriver.chrome.driver";
		String values ="./Softwares/chromedriver.exe";
		System.setProperty(key, values);
		new ChromeDriver();
	}
}
