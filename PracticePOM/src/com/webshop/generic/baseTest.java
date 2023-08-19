package com.webshop.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.webshop.pom.*;

public class baseTest {
	public static WebDriver driver;
	public static WelcomPage welcomepage;
	public static LoginPage loginpage;
	static {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		driver = new ChromeDriver();
		welcomepage =new WelcomPage(driver);
		loginpage =new LoginPage(driver);
	}
	

}
