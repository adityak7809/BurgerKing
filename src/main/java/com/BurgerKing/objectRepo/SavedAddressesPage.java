package com.BurgerKing.objectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class SavedAddressesPage {
	
	AndroidDriver driver;
	
	
	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"+  Add Address\")")
	private WebElement addAddressButton;
	
	@AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.view.ViewGroup\").instance(21)")
	private WebElement threeDotButton;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"EDIT\"]")
	private WebElement editButton;
	
	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"DELETE\")")
	private WebElement deleteButton;
	
	@AndroidFindBy(xpath = "//android.widget.EditText[1]")
	private WebElement flatNumberEdit;
	
	@AndroidFindBy(xpath = "//android.widget.EditText[2]")
	private WebElement landmarkEdit;
	
	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Home\")")
	private WebElement saveAsHomeButton;
	
	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Work\")")
	private WebElement saveAsWorkButton;
	
	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Other\")")
	private WebElement saveAsOtherButton;
	
	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Save Address\")")
	private WebElement saveAddressButton;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[2]")
	private WebElement addressDetails;
	
	
	

	public SavedAddressesPage(AndroidDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}




	public AndroidDriver getDriver() {
		return driver;
	}




	public WebElement getAddAddressButton() {
		return addAddressButton;
	}




	public WebElement getThreeDotButton() {
		return threeDotButton;
	}




	public WebElement getEditButton() {
		return editButton;
	}




	public WebElement getDeleteButton() {
		return deleteButton;
	}




	public WebElement getFlatNumberEdit() {
		return flatNumberEdit;
	}




	public WebElement getLandmarkEdit() {
		return landmarkEdit;
	}




	public WebElement getSaveAsHomeButton() {
		return saveAsHomeButton;
	}




	public WebElement getSaveAsWorkButton() {
		return saveAsWorkButton;
	}




	public WebElement getSaveAsOtherButton() {
		return saveAsOtherButton;
	}




	public WebElement getSaveAddressButton() {
		return saveAddressButton;
	}




	public WebElement getAddressDetails() {
		return addressDetails;
	}
	
	
	
	
	



	
}
