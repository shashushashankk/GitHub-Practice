package Scripts;

import org.openqa.selenium.firefox.FirefoxDriver;

public class LanchEmptyFirefoxBrowser 
{
	public static void main(String[] args) 
	{
		String key="webdriver.gecko.driver";
		String values ="./Softwares/geckodriver.exe";
		System.setProperty(key, values);
		FirefoxDriver driver = new FirefoxDriver();
	}

}
