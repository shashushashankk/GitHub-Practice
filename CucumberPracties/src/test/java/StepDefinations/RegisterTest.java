package StepDefinations;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Then;

public class RegisterTest {
	WebDriver driver=LoginTest.driver;
	@Then("click on Register link")
	public void click_on_register_link() {
	  driver.findElement(By.xpath("//a[.='Register']")).click();
	}

	@Then("enter all the valid credential and click on submit button")
	public void enter_all_the_valid_credential_and_click_on_submit_button() {
		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Shashank");
		driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("K");
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("shashankkshetty@gmail.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Shashu@1234");
		driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("Shashu@1234");
		driver.findElement(By.xpath("//input[@value='Register']")).click();
		driver.findElement(By.xpath("//a[.='Log out']")).click();
	}

	@Then("goto login page and enter valid username and password and click on login")
	public void goto_login_page_and_enter_valid_username_and_password_and_click_on_login() {
	  driver.findElement(By.xpath("//a[.='Log in']")).click();
		driver.findElement(By.id("Email")).sendKeys("shashankkshetty2000@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Shashu@123");
		driver.findElement(By.id("RememberMe")).click();
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
	}

	@Then("Check user is able to logged in")
	public void check_user_is_able_to_logged_in() {
		if (driver.findElement(By.xpath("//div[@class='header-links']//a[@class='account']")).getText()
				.contains("shashankkshetty2000@gmail.com")) {
			System.out.println("user successfully logged in");
		}
	}

}
