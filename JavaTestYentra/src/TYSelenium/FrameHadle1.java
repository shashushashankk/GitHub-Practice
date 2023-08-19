package TYSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHadle1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/frames");
		driver.switchTo().frame("frame1");
		WebElement frame1add=driver.findElement(By.xpath("//h1[.='This is a sample page']"));
		String text = frame1add.getText();
		System.out.println("Frame 1 test : "+text);
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frame2");
		WebElement frame2add = driver.findElement(By.xpath("//h1[.='This is a sample page']"));
		String text1 =frame2add.getText();
		System.out.println("Frame2 Text : "+text1);
		driver.switchTo().defaultContent();
		driver.quit();
	}

}