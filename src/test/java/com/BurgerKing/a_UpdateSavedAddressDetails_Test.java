package com.BurgerKing;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.BurgerKing.objectRepo.HamBurgerPage;
import com.BurgerKing.objectRepo.HomePage;
import com.BurgerKing.objectRepo.SavedAddressesPage;

import Utilities.AndroidUtility;
import Utilities.BaseClass;
import Utilities.ListenerImplementation;
import Utilities.UtilityClassObject;

/*
 * Update Saved Address Details
 */

@Listeners(ListenerImplementation.class)
public class a_UpdateSavedAddressDetails_Test extends BaseClass{
	
	@Test
	public void updateDetailsTest() throws InterruptedException, EncryptedDocumentException, IOException {
		
		homePageObj = new HomePage(driver);
		hamBurgerPage = new HamBurgerPage(driver);
		savedAddressesPageObj = new SavedAddressesPage(driver);
		androidUtility = new AndroidUtility(driver);
		
//		click on Delivery
		UtilityClassObject.getTest().info("Click on Delivery button");
		homePageObj.getDeliveryButton().click();
		
//		click on Menu button
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
//		wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.view.ViewGroup\").instance(93)")));
		androidUtility.waitForElementToLoad(homePageObj.getTopHeader());
		homePageObj.getHamBurgerButton();
		
//		click on update profile button
		hamBurgerPage.getSavedAddressesButton().click();
		
//		click on edit button
		Thread.sleep(2000);
		savedAddressesPageObj.getThreeDotButton().click();
		savedAddressesPageObj.getEditButton().click();
		
//		Enter all details
		String flatName = excelUtility.readDataFromExcel("Address", 2, 1);
		String landmark = excelUtility.readDataFromExcel("Address", 2, 2);
		
		savedAddressesPageObj.getFlatNumberEdit().clear();
		savedAddressesPageObj.getFlatNumberEdit().sendKeys(flatName);
	
		savedAddressesPageObj.getLandmarkEdit().clear();
		savedAddressesPageObj.getLandmarkEdit().sendKeys(landmark);

		savedAddressesPageObj.getSaveAsHomeButton().click();
		
//		Click on  Save Address button
		savedAddressesPageObj.getSaveAddressButton().click();
		
//		Validate the address
		
		String  expText = flatName+", "+landmark;
		String actText = savedAddressesPageObj.getAddressDetails().getText();
		System.out.println(actText);
		
		if(actText.contains(expText))
		{
			System.out.println("Test passed......");
		}
		else
		{
			System.out.println("Test failed....!");
		}
		
		
	}

}

