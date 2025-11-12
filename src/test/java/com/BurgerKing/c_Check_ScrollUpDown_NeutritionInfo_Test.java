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
import Utilities.UtilityClassObject;

@Listeners(ListenerImplementation.class)
public class c_Check_ScrollUpDown_NeutritionInfo_Test extends BaseClass {

	
	@Test
	public void neutritionInfo() throws MalformedURLException, InterruptedException {
		
		homePageObj = new HomePage(driver);
		hamBurgerPage = new HamBurgerPage(driver);
		savedAddressesPageObj = new SavedAddressesPage(driver);
		nutritionInfoPageObj = new NutritionInfoPage(driver);
		gestureUtility = new GestureUtility(driver);
		androidUtility = new AndroidUtility(driver);
		
//		click on Delivery
		UtilityClassObject.getTest().info("Click on Delivery Button");
		homePageObj.getDeliveryButton().click();
		
//		click on Menu button
		UtilityClassObject.getTest().info("Wait for Main page to load");
		androidUtility.waitForElementToLoad(homePageObj.getTopHeader());
		
		UtilityClassObject.getTest().info("Click on Hamburger button");
		homePageObj.getHamBurgerButton();
		
		
//		click on Nutrition Info
		UtilityClassObject.getTest().info("Click on Nutrition button");
		hamBurgerPage.getNutritionInfoButton().click();
		
		
//      Scroll down and scroll up the info
		
//		((JavascriptExecutor)driver).executeScript("mobile: scrollGesture", 
//			    ImmutableMap.of(
//			        "left", 100, "top", 500,
//			        "width", 600, "height", 1000,
//			        "direction", "up",
//			        "percent", 1.0
//			    ));
		
		UtilityClassObject.getTest().info("Scroll up");
		gestureUtility.scrollByCoordinate(100, 500, 600, 1000, "up", 1.0);
		
		Thread.sleep(2000);
	
		UtilityClassObject.getTest().info("Scroll down");
		gestureUtility.scrollByCoordinate(100, 500, 600, 1000, "down", 1.0);
		
	}

}
