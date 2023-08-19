package Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoicationFBLogin {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		WebElement Login= driver.findElement(By.name("login"));
		Point LocLogin =Login.getLocation();
		int x=LocLogin.getX();
		int y=LocLogin.getY();
		System.out.println("Location of login is"+LocLogin);
		System.out.println("Login button X loc is"+x);
		System.out.println("Login Button Y loc is"+y);
		Point P = new Point(125, 300) ;
		driver.manage().window().setPosition(P);
	}
}
