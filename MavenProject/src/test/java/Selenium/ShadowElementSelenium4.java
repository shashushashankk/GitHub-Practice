package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ShadowElementSelenium4 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://watir.com/examples/shadow_dom.html");
		WebElement shadowHost = driver.findElement(By.id("shadow_host"));
		SearchContext shadowRoot = shadowHost.getShadowRoot();
		WebElement nestedshadowHost = shadowRoot.findElement(By.cssSelector("div[id='nested_shadow_content']"));
		SearchContext nestedShadowRoot = nestedshadowHost.getShadowRoot();
		System.out.println(nestedShadowRoot.findElement(By.cssSelector("div[id='nested_shadow_content']>div")).getText());
		driver.quit();
	}
}
