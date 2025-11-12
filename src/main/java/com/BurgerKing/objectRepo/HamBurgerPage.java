package com.BurgerKing.objectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class HamBurgerPage {
	
	AndroidDriver driver;
	
	
	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Recent Orders\")")
	private WebElement recentOrderButton;
	
	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Saved Addresses\")")
	private WebElement savedAddressesButton;
	
	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Saved King Deals\")")
	private WebElement savedKingDealsButton;
	
	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"BK Wall\")")
	private WebElement bKWallButton;
	
	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"FAQs & Support\")")
	private WebElement faqsAndSupportButton;
	
	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Legal Terms\")")
	private WebElement legalTermsButton;
	
	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Nutrition Info\")")
	private WebElement nutritionInfoButton;
	
	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"FSSAI\")")
	private WebElement fssaiButton;
	
	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Logout\")")
	private WebElement logoutButton;
	
	

	public HamBurgerPage(AndroidDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}



	public AndroidDriver getDriver() {
		return driver;
	}



	public WebElement getRecentOrderButton() {
		return recentOrderButton;
	}



	public WebElement getSavedAddressesButton() {
		return savedAddressesButton;
	}



	public WebElement getSavedKingDealsButton() {
		return savedKingDealsButton;
	}



	public WebElement getbKWallButton() {
		return bKWallButton;
	}



	public WebElement getFaqsAndSupportButton() {
		return faqsAndSupportButton;
	}



	public WebElement getLegalTermsButton() {
		return legalTermsButton;
	}



	public WebElement getNutritionInfoButton() {
		return nutritionInfoButton;
	}



	public WebElement getFssaiButton() {
		return fssaiButton;
	}



	public WebElement getLogoutButton() {
		return logoutButton;
	}

	
	
	
	
	

	
	
	
	
}
