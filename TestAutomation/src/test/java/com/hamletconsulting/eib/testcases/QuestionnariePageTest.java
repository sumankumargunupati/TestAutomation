package com.hamletconsulting.eib.testcases;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.hamletconsulting.eib.LoginPage;
import com.hamletconsulting.eib.QuestionnariePage;
import com.hamletconsulting.eib.TestBase;

public class QuestionnariePageTest extends TestBase {
	 LoginPage loginPage;
	 QuestionnariePage QuestionnariePage;
	    @FindBy(xpath = "//input[@name='have to give expected text']")
		WebElement loginMessage;


	    public QuestionnariePageTest(){
	        super();
	    }

	    @BeforeMethod
	    public void setUp(){
	        initialization();
	        loginPage = new LoginPage();
	        driver.get(System.getProperty("user.dir")+"/"+prop.getProperty("Questionnarieurl"));
	        QuestionnariePage = new QuestionnariePage();
	    }
	    
	    @Test
	    public void selectRadiobuttons() throws InterruptedException {
	    	QuestionnariePage.SelectRadioButtonsQuestionnariesPage();
	    }
	    
	    @Test
	   public void selectItemfromListbox() throws InterruptedException {
		   QuestionnariePage.selectItemfromListbox("D2 Approval by Advisory Committee");
		   
	   }
	    	
	    	
	    	
	   // }
	
	    @AfterMethod
	    public void tearDown(){
	        driver.quit();
	    }


}
