package com.hamletconsulting.eib.testcases;

import com.hamletconsulting.eib.LoginPage;
import com.hamletconsulting.eib.TestBase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase {
	LoginPage loginPage;

	public LoginPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		driver.get(System.getProperty("user.dir") + "/" + prop.getProperty("Loginurl"));

	}

	@Test(priority = 1)
	public void loginTestSuccess() {
		loginPage.login(prop.getProperty("validusername"), prop.getProperty("validpassword"));
		Assert.assertEquals(loginPage.getLoginmessage().getText(), "success",
				"Successfully login with valid creditals");

	}

	@Test(priority = 2)
	public void loginTestErrorInvlalidEmail() {
		loginPage.login(prop.getProperty("invalidemail"), prop.getProperty("validpassword"));
		Assert.assertEquals(loginPage.getLoginmessage().getText(), "invalid email",
				"Invalid email error appreared in login page");
	}

	@Test(priority = 3)
	public void loginTestErrorIncorrectEmail() {
		loginPage.login(prop.getProperty("incorrectmail"), prop.getProperty("validpassword"));
		Assert.assertEquals(loginPage.getLoginmessage().getText(), "enter correct email",
				"enter correct email error appread in login page");
	}

	@Test(priority = 4)
	public void loginVerifyElements() {
		boolean loginVeriElements = loginPage.loginPagedisplay();
		Assert.assertTrue(loginVeriElements);

	}

	// Additional scanarios

	@Test(priority = 5)
	public void loginTestErrorInvalidPassword() {
		loginPage.login(prop.getProperty("validusername"), prop.getProperty("invalidpassword"));
		Assert.assertEquals(loginPage.getLoginmessage().getText(), "enter correct password",
				"enter correct password error appread in login page");
	}

	@Test(priority = 6)
	public void loginTestErrorInvalidusernamepassword() {
		loginPage.login(prop.getProperty("invalidemail"), prop.getProperty("invalidpassword"));
		Assert.assertEquals(loginPage.getLoginmessage().getText(), "enter correct username and password",
				"enter valid username and valid password error appread in login page");
	}

	@Test(priority = 7)
	public void loginTestErrorInvaliduservalidpassword() {
		loginPage.login(prop.getProperty("invaliduser"), prop.getProperty("password"));
		Assert.assertEquals(loginPage.getLoginmessage().getText(), "user not found",
				"user not found error appread in login page");
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
