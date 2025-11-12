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
public class b_Check_Zoom_NeutritionInfo_Test extends BaseClass {
	
	@Test
	public void neutrutionInfo() throws MalformedURLException, InterruptedException {
		
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
		hamBurgerPage.getNutritionInfoButton().click();
		
//      Zoom in and Zoom Out the info
		// Zoom in-------------------
		gestureUtility.pinchOpen(nutritionInfoPageObj.getPageDetails(), 0.75);

		Thread.sleep(1000);
		
		// Zoom in-------------------
		gestureUtility.pinchClose(nutritionInfoPageObj.getPageDetails(), 0.75);
		
	}

}
