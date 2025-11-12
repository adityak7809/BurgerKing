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
		homePageObj.getDeliveryButton().click();
		
//		click on Menu button
		androidUtility.waitForElementToLoad(homePageObj.getTopHeader());
		homePageObj.getHamBurgerButton();
		
		
//		click on Neutrition Infor
		hamBurgerPage.getNeutritionInfoButton().click();
		
		
//      Scroll down and scroll up the info
		
//		((JavascriptExecutor)driver).executeScript("mobile: scrollGesture", 
//			    ImmutableMap.of(
//			        "left", 100, "top", 500,
//			        "width", 600, "height", 1000,
//			        "direction", "up",
//			        "percent", 1.0
//			    ));
		
		gestureUtility.scrollByCoordinate(100, 500, 600, 1000, "up", 1.0);
		
		Thread.sleep(2000);
	
		gestureUtility.scrollByCoordinate(100, 500, 600, 1000, "down", 1.0);
		
	}

}
