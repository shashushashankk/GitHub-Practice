package Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FbErrorMsg {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("shashankkshetty2000@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("tfgayhvg");
		driver.findElement(By.name("login")).click();
		 WebElement Error_Msg =driver.findElement(By.xpath("//input[@id='pass']/../../../div[2]"));
		String text=Error_Msg.getText();
		System.out.println(text);
	}
}
