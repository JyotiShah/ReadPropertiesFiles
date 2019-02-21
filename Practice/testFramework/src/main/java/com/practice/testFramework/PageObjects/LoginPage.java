package com.practice.testFramework.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.practice.testFramework.helper.ObjectReader;
import com.practice.testFramework.testScripts.TestBase;

public class LoginPage extends TestBase{

//	private WebDriver driver;

	@FindBy(xpath = "//*[@id='username']")
	WebElement username;

	@FindBy(xpath = "//*[@id='passwd']")
	WebElement password;

	public LoginPage(WebDriver driver) {
		
		PageFactory.initElements(TestBase.driver, LoginPage.class);
	}

	public void enterUsername() {

	}

	public void enterPassword() {

	}
	
	public void loginApp(){
		getUrl(ObjectReader.reader.getURL());
	}
}
