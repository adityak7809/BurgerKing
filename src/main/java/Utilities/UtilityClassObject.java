package Utilities;

import com.aventstack.extentreports.ExtentTest;

import io.appium.java_client.android.AndroidDriver;

public class UtilityClassObject {

	public static ThreadLocal<ExtentTest> test = new ThreadLocal<>();
	public static ThreadLocal<AndroidDriver> driver = new ThreadLocal<AndroidDriver>();

	public static ExtentTest getTest()
	{
		return test.get();
	}

	public static void setTest(ExtentTest actTest)
	{
		test.set(actTest);
	}

	// getter driver
	public static AndroidDriver getDriver() {
		return driver.get();
	}

	// setter driver
	public static void setDriver(AndroidDriver actDriver) {
		driver.set(actDriver);
	}
}
