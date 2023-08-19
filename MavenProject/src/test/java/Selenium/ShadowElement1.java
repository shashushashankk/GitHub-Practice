package Selenium;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;

public class ShadowElement1 {
	static WebDriver driver;
	public static void main(String[] args) {
		ChromeDriverManager.chromedriver().setup();
		 driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
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
