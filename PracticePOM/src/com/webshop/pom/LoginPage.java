package com.webshop.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage {
	@FindBy(xpath = "//input[@class='button-1 register-button']")
	private WebElement Register;
	@FindBy(xpath ="//input[@class='email']" )
	private WebElement EmailTextField;
	@FindBy (xpath = "//input[@class='password']")
	private WebElement PaswordTextField;
	@FindBy(id = "RememberMe")
	private WebElement RememberMeCheckBox;
	@FindBy(xpath = "//input[@class='button-1 login-button']")
	private WebElement LoginButton;
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void getRegister() {
		 Register.click();
	}
	public void getEmailTextField(String user_name) {
		 EmailTextField.sendKeys(user_name);
	}
	public void getPaswordTextField(String password) {
		 PaswordTextField.sendKeys(password);
	}
	
	public void getRememberMeCheckBox() {
		 RememberMeCheckBox.click();
	}
	public void getLoginButton() {
		 LoginButton.click();
	}
	

}
