package com.webshop.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomPage {
	
	public WelcomPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//a[.='Register']")
	private WebElement Register;
	@FindBy(xpath="//a[.='Log in']")
	private WebElement Login;
	@FindBy(xpath = "//input[@name='q']")
	private WebElement Search;
	@FindBy(xpath = "//ul[@class='top-menu' ]//a[contains(.,'Books')]")
	private WebElement Books;
	@FindBy(xpath = "//ul[@class='top-menu' ]//a[contains(.,'Computers')]")
	private WebElement Computers;
	public WebElement getRegister() {
		return Register;
	}
	public void getLogin() {
		Login.click();
	}
	public void getSearch(String product_name) {
		Search.sendKeys(product_name);
	}
	public void getBooks() {
		 Books.click();
	}
	public void getComputers() {
		 Computers.click();
	}
	

}
