package com.BurgerKing.objectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import Utilities.GestureUtility;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class HomePage {
	
	AndroidDriver driver;
	
	@AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(1)")
	private WebElement deliveryButton;
	
	@AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(2)")
	private WebElement takeAwayButton;	
	
	@AndroidFindBy(uiAutomator = "new UiSelector().className(\"com.horcrux.svg.PathView\").instance(4)")
	private WebElement homeButton;
	
	@AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.view.ViewGroup\").instance(93)")
	private WebElement topHeader;
	
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Our Menu\"]")
	private WebElement ourMenu;
	
	@AndroidFindBy(uiAutomator = "new UiSelector().className(\"com.horcrux.svg.PathView\").instance(5)")
	private WebElement menuButton;
	
	@AndroidFindBy(uiAutomator = "new UiSelector().className(\"com.horcrux.svg.PathView\").instance(6)")
	private WebElement crownRewardsButton;
	
	@AndroidFindBy(uiAutomator = "new UiSelector().className(\"com.horcrux.svg.PathView\").instance(8)")
	private WebElement nearbyStoreButton;
	
	@AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(1)")
	private WebElement swipeMenu;
	
	
	
	

	public HomePage(AndroidDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	public AndroidDriver getDriver() {
		return driver;
	}
	
	
	
	public WebElement getTopHeader() {
		return topHeader;
	}

	public WebElement getOurMenu() {
		return ourMenu;
	}

	public WebElement getDeliveryButton() {
		return deliveryButton;
	}

	public WebElement getTakeAwayButton() {
		return takeAwayButton;
	}


	public void getHamBurgerButton() throws InterruptedException
	{
		Thread.sleep(2000);
		GestureUtility obj = new GestureUtility(driver);
		obj.clickByCoordinates(80, 205);
	}


	public WebElement getHomeButton() {
		return homeButton;
	}


	public WebElement getMenuButton() {
		return menuButton;
	}


	public WebElement getCrownRewardsButton() {
		return crownRewardsButton;
	}


	public WebElement getNearbyStoreButton() {
		return nearbyStoreButton;
	}

	public WebElement getSwipeMenu() {
		return swipeMenu;
	}
	
	
	
	

	
	
	
	
}
