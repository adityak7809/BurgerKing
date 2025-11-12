package com.BurgerKing.objectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class NutritionInfoPage {
	
	AndroidDriver driver;
	
	
	@AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.RelativeLayout\")")
	private WebElement pageDetails;
	
	@AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.view.ViewGroup\").instance(14)")
	private WebElement backButton;
	

	public NutritionInfoPage(AndroidDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}


	public AndroidDriver getDriver() {
		return driver;
	}


	public WebElement getPageDetails() {
		return pageDetails;
	}


	public WebElement getBackButton() {
		return backButton;
	}
	
	
	
	



	
}
