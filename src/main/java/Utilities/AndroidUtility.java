package Utilities;



import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.appmanagement.ApplicationState;

public class AndroidUtility {

	AndroidDriver driver;
	
	
	public AndroidUtility(AndroidDriver driver)
	{
		this.driver=driver;
	}
	
	public void waitForElementToLoad(WebElement element)
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	public void installApp(String filePath)
	{	
		driver.installApp(filePath);
	}

	public void isAppInstalled(String appPackage)
	{
		boolean status = driver.isAppInstalled(appPackage);
		System.out.println(status+"..................!");
	}

	public void activateApp(String appPackage)
	{
		driver.activateApp(appPackage);
	}

	public void uninsatllApp(String appPackage)
	{
		driver.removeApp(appPackage);
	}

	public void terminateApp(String appPackage)
	{
		driver.terminateApp(appPackage);
	}

	public void runAppInBackground(int seconds, String appPackage)
	{
		driver.runAppInBackground(Duration.ofSeconds(seconds));
		ApplicationState state = driver.queryAppState(appPackage);
		System.out.println(state+".....................!");
	}

	public void getCurrentActivity()
	{
		String status = driver.currentActivity();
		System.out.println(status);
	}

	public void openNotification()
	{
		driver.openNotifications();
	}

	public void hideKeyboad()
	{
		driver.hideKeyboard();
	}

	public void rotateScreen(String orintation)
	{
		if(orintation.toUpperCase().equals("LANDSCAPE"))
		{
			driver.rotate(ScreenOrientation.LANDSCAPE);
		}
		else
		{
			driver.rotate(ScreenOrientation.PORTRAIT);
		}
	}
	
	
	public void getToastMessage(int index)
	{
		String message = driver.findElement(AppiumBy.
				       xpath("//android.widget.Toast["+index+"]")).
				       getText();
		System.out.println(message);
	}
	
	public void pressKey(AndroidKey key)
	{
		driver.pressKey(new KeyEvent(key));
		System.out.println("Pressed key: "+key.name());
	}
	
//  xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
	public void getContext()
	{
		Set<String> contexts = driver.getContextHandles();
		System.out.println(contexts.size());
		for (String ch : contexts) {
			System.out.println(ch);
			if(ch.contains("WEBVIEW_")) {
				driver.context(ch);
				break;
			}
		}
	}
	
	public void setClipBoardText(String text)
	{
		driver.setClipboardText(text);
	}
	
	public void getClipBoardText()
	{
		String data = driver.getClipboardText();
		System.out.println(data);
	}
	

}






















