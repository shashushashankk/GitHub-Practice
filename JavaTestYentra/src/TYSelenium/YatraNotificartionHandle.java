package TYSelenium;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YatraNotificartionHandle {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("https://www.yatra.com");
		Runtime.getRuntime().exec("./AutoIT/NotificationPopup.exe");
		//driver.close();
	}

}
