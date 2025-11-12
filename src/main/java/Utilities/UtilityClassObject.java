package Utilities;

import io.appium.java_client.android.AndroidDriver;

public class UtilityClassObject {

	public static ThreadLocal<AndroidDriver> driver = new ThreadLocal<AndroidDriver>();
	
	// getter driver
		public static AndroidDriver getDriver() {
			return driver.get();
		}

		// setter driver
		public static void setDriver(AndroidDriver actDriver) {
			driver.set(actDriver);
		}
}
