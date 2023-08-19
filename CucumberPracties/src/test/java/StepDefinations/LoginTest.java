package StepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginTest {
	public static WebDriver driver;

	@Given("browser is open")
	public void browser_is_open() {
	   System.setProperty("webdriver.chrome.driver","./src/main/resources/Softwares/chromedriver.exe");
	   driver=new ChromeDriver();
	}

	@Given("application is displayed")
	public void application_is_displayed() {
		driver.get("https://demowebshop.tricentis.com/");
	}

	@When("user clicks on login link")
	public void user_clicks_on_login_link() {
		driver.findElement(By.xpath("//a[.='Log in']")).click();
	}

	@When("use enters valid credentials")
	public void use_enters_valid_credentials() {
		driver.findElement(By.id("Email")).sendKeys("shashankkshetty2000@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Shashu@123");
		driver.findElement(By.id("RememberMe")).click();
	}

	@When("user clicks on login button")
	public void user_clicks_on_login_button() {
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
	}

	@Then("user must be successfully logged in")
	public void user_must_be_successfully_logged_in() {
		if (driver.findElement(By.xpath("//div[@class='header-links']//a[@class='account']")).getText()
				.contains("shashankkshetty2000@gmail.com")) {
			System.out.println("user successfully logged in");
		}
	}

	@Then("browser closes")
	public void browser_closes() {
		driver.close();
	}

}
