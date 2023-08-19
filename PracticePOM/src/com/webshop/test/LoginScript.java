package com.webshop.test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.webshop.generic.UtilityMethod;
import com.webshop.generic.baseTest;
import com.webshop.pom.LoginPage;
import com.webshop.pom.WelcomPage;


public class LoginScript extends baseTest {
	//static WebDriver driver;
	/*
	 * static { System.setProperty("webdriver.chrome.driver",
	 * "./Softwares/chromedriver.exe"); }
	 */

	public static void main(String[] args) throws IOException, InterruptedException {
		//driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//WelcomPage welcomepage=new WelcomPage(driver);
		//LoginPage loginpage=new LoginPage(driver);
		UtilityMethod um=new UtilityMethod();
		driver.get("https://demowebshop.tricentis.com/");
		welcomepage.getLogin();
		loginpage.getEmailTextField(um.propertyFileDataReader("un"));
		loginpage.getPaswordTextField(um.propertyFileDataReader("pwd"));
		loginpage.getRememberMeCheckBox();
		loginpage.getLoginButton();
		driver.quit();
		/*
		 * welcomepage.Login.click();
		 * loginpage.EmailTextField.sendKeys("shashankkshetty2000@gmail.com");
		 * loginpage.PaswordTextField.sendKeys("Shashu@123");
		 * loginpage.RememberMeCheckBox.click(); loginpage.LoginButton.click();
		 */	
	}
}
