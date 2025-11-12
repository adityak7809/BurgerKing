package Utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class GestureUtility {
	
	AndroidDriver driver;
	
	public GestureUtility(AndroidDriver driver)
	{
		this.driver=driver;
	}
	
	
	public void clickByElement(WebElement element)
	{
		((JavascriptExecutor)driver).executeScript("mobile: clickGesture", 
				ImmutableMap.of("elementId", (RemoteWebElement)element));
	}
	
	public void clickByCoordinates(int xValue, int yValue)
	{
		((JavascriptExecutor)driver).executeScript("mobile: clickGesture", 
				ImmutableMap.of("x",xValue, "y", yValue));
	}
	
	public void doubleClickByElement(WebElement element)
	{
		((JavascriptExecutor)driver).executeScript("mobile: doubleClickGesture", 
				ImmutableMap.of("elementId", ((RemoteWebElement)element).getId()));
	}

	public void doubleClickByCoordinate(int xValue, int yValue)
	{
		((JavascriptExecutor)driver).executeScript("mobile: doubleClickGesture",
				ImmutableMap.of("x",xValue, "y", yValue));
	}
	
	public void longPressElement(WebElement element)
	{
		((JavascriptExecutor)driver).executeScript("mobile: longClickGesture",
				ImmutableMap.of("elementId", ((RemoteWebElement)element).getId()));
	}
	
	public void dragAndDropElement(WebElement element, int endXValue, int endYValue)
	{
		((JavascriptExecutor)driver).executeScript("mobile: dragGesture", 
				ImmutableMap.of("elementId", ((RemoteWebElement)element).getId(), "endX",endXValue, "endY", endYValue));
	}
	
	public void dragAndDropByCoordinate(int startXValue, int startYValue, int endXValue, int endYValue, int speedValue)
	{
		((JavascriptExecutor)driver).executeScript("mobile: dragGesture", 
				ImmutableMap.of("startX",startXValue ,"startY",startYValue ,"endX",endXValue ,"endY",endYValue ,"speed",speedValue));
	}
	
	public void pinchOpen(WebElement element, double pinchPercent)
	{
		((JavascriptExecutor)driver).executeScript("mobile: pinchOpenGesture", 
				ImmutableMap.of("elementId", ((RemoteWebElement)element)
						.getId(), "percent", pinchPercent));
	}
	
	public void pinchClose(WebElement element, double pinchPercent)
	{
		((JavascriptExecutor)driver).executeScript("mobile: pinchCloseGesture", 
				ImmutableMap.of("elementId", ((RemoteWebElement)element)
						.getId(), "percent", pinchPercent));
	}
	
	public void swipeByElement(WebElement element, String direction, double percent)
	{
		((JavascriptExecutor)driver).executeScript("mobile: swipeGesture", 
				ImmutableMap.of("elementId", ((RemoteWebElement)element).getId(), "direction", direction, "percent", percent));
	}
	
	public void swipeByCoordinate(int left, int top, int width, int height, String direction, double percent)
	{
		((JavascriptExecutor)driver).executeScript("mobile: swipeGesture", 
				ImmutableMap.of("left",left, "top",top, "width",width, "height",height, "direction", direction, "percent", percent));
	}
	
	public WebElement scrollIntoView(String text)
	{
		return driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\""+text+"\"));"));
	}
	
	public void scrollByCoordinate(int left, int top, int width, int height, String direction, double percent) {
	    ((JavascriptExecutor)driver).executeScript("mobile: scrollGesture", 
	            ImmutableMap.of(
	                    "left", left,        
	                    "top", top,
	                    "width", width,
	                    "height", height,    
	                    "direction", direction,
	                    "percent", percent));
	}
	
	
	
	
}

































