package com.BurgerKing;

import java.net.MalformedURLException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.BurgerKing.objectRepo.HamBurgerPage;
import com.BurgerKing.objectRepo.HomePage;
import com.BurgerKing.objectRepo.NutritionInfoPage;
import com.BurgerKing.objectRepo.SavedAddressesPage;

import Utilities.AndroidUtility;
import Utilities.BaseClass;
import Utilities.GestureUtility;
import Utilities.ListenerImplementation;


@Listeners(ListenerImplementation.class)
public class e_Check_RightleftScroll_InCampaignMenu_Test extends BaseClass{

	@Test
	public void campaignPageTest() throws MalformedURLException, InterruptedException {
		
		
		homePageObj = new HomePage(driver);
		hamBurgerPage = new HamBurgerPage(driver);
		savedAddressesPageObj = new SavedAddressesPage(driver);
		nutritionInfoPageObj = new NutritionInfoPage(driver);
		gestureUtility = new GestureUtility(driver);
		androidUtility = new AndroidUtility(driver);
		
//		click on Delivery
		homePageObj.getDeliveryButton().click();
		
//      Verify menu page is displayed
		boolean text = homePageObj.getOurMenu().isDisplayed();
		if(text==true)
		{
			System.out.println("Menu page is displayed successfully");
		}
		else
		{
			System.out.println("Menu page is not displayed");
		}


//      check swipe left and swipe right
		Thread.sleep(2000);
		
//      scroll left
		gestureUtility.swipeByElement(homePageObj.getSwipeMenu(), "left", 0.90);
		
//		((JavascriptExecutor)driver).executeScript("mobile: swipeGesture", ImmutableMap.of(
//				"elementId", ((RemoteWebElement)element).
//				getId(), "direction", "left", "percent", 0.90));

		Thread.sleep(1000);

//      scroll right
//		((JavascriptExecutor)driver).executeScript("mobile: swipeGesture", ImmutableMap.of(
//				"elementId", ((RemoteWebElement)element).
//				getId(), "direction", "right", "percent", 0.90));
		
		gestureUtility.swipeByElement(homePageObj.getSwipeMenu(), "right", 0.90);



	}
}
