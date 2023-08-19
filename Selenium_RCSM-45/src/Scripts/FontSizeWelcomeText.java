package Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FontSizeWelcomeText {
	public static void main(String[] args) {
		String data = "28px";
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		WebElement WelText = driver.findElement(By.xpath("//h2[contains(.,'Face')]"));
		String size = WelText.getCssValue("font-size");
		if (size.equals(data)) {
			System.out.println("Testcase Pass");
		} else {
			System.out.println("Testcase Pass");
		}
	}
}
