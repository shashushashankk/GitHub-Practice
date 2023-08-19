package TYSelenium;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FielUploadPopup {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("https://smallpdf.com/pdf-to-word");
		driver.findElement(By.xpath("//span[.='Choose Files']")).click();
		Runtime.getRuntime().exec("./AutoIT/UploadPopup.exe");
		Thread.sleep(5000);
		driver.close();
	}

}
