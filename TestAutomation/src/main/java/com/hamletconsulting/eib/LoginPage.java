package com.hamletconsulting.eib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends TestBase {

	// Page Factory - OR:
	@FindBy(id = "username")
	WebElement username;

	@FindBy(id = "password")
	WebElement password;

	@FindBy(id = "kc-login")
	WebElement loginBtn;

	@FindBy(id = "kc-page-title")
	WebElement loginlabel;

	@FindBy(id = "text")
	WebElement loginMessage;

	// Initializing the Page Objects:
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	public void login(String un, String pwd) {
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginBtn.click();
	}

	public WebElement getLoginmessage() {
		return loginMessage;

	}

	public boolean loginPagedisplay() {
		boolean boolUsernameDisplay = username.isDisplayed();
		boolean boolPasswordDisplay = password.isDisplayed();
		boolean boolLogibuttonDisplay = loginBtn.isDisplayed();
		boolean boolLoginlableDisplay = loginlabel.isDisplayed();
		boolean loginPageElementsDisplay = ((boolUsernameDisplay) && ((boolPasswordDisplay)) && (boolLogibuttonDisplay)
				&& boolLoginlableDisplay);
		return loginPageElementsDisplay;

	}

}
