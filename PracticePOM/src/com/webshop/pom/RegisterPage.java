package com.webshop.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	@FindBy(id = "gender-male")
	private WebElement GenderMaleBtn;
	@FindBy (id = "gender-female")
	private WebElement GenderFemalebtn;
	@FindBy(id = "FirstName")
	private WebElement FirstNameText;
	@FindBy(id = "LastName")
	private WebElement LastName;
	//@FindBy
	public  RegisterPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void getGenderMaleBtn() {
		 GenderMaleBtn.click();
	}
	public void getGenderFemalebtn() {
		 GenderFemalebtn.click();
	}
	public void getFirstNameText(String First_name) {
		 FirstNameText.sendKeys(First_name);
	}
	public void getLastName(String Last_name) {
		 LastName.sendKeys(Last_name);
	}
	
}
