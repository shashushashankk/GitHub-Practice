package TYSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowElement1 {
	static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		 driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("http://watir.com/examples/shadow_dom.html");
		WebElement shadowhost = driver.findElement(By.id("shadow_host"));
		SearchContext shadowRoot = expandShadowRoot(shadowhost);
		//String text = shadowroot.findElement(By.cssSelector("span[id='shadow_content']")).getText();
		System.out.println(shadowRoot.findElement(By.cssSelector("span[id='shadow_content']")).getText());
		driver.quit();
	}
	public static SearchContext expandShadowRoot(WebElement shadowhost) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		SearchContext shadowRoot =(SearchContext) js.executeScript("return arguments[0].shadowRoot", shadowhost);
		return shadowRoot;
	}

}
