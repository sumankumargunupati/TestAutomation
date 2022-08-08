package com.hamletconsulting.eib;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class QuestionnariePage extends TestBase {

	// Page Factory - OR:
	@FindBy(xpath = "//input[@type='radio']")
	List<WebElement> radiobutton;

	@FindBy(xpath = "//span[@role='listbox']//ul[contains(@class='ui-autocomplete-items']")
	WebElement listbox;

//Initializing the Page Objects:
	public QuestionnariePage() {
		PageFactory.initElements(driver, this);
	}

	public void SelectRadioButtonsQuestionnariesPage() throws InterruptedException {
		List<WebElement> allRadiobuttons = radiobutton;
		System.out.println(allRadiobuttons.size());
		int cnt = allRadiobuttons.size();
		for (int i = 0; i < cnt; i++) {
			Thread.sleep(2000);
			allRadiobuttons.get(i).click();
			i++;
		}
	}

	public void selectItemfromListbox(String expectedValue) throws InterruptedException {
		WebElement lstbox = listbox;
		Select sel = new Select(lstbox);
		List<WebElement> allvals = sel.getOptions();
		for (int i = 0; i < allvals.size(); i++) {
			Thread.sleep(1000);
			String actualValue = allvals.get(i).getText();
			if (actualValue.equals(expectedValue)) {
				sel.selectByIndex(i);
			}

		}

	}
}
