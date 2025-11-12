package Utilities;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.BurgerKing.objectRepo.HomePage;
import com.BurgerKing.objectRepo.NutritionInfoPage;
import com.BurgerKing.objectRepo.SavedAddressesPage;
import com.BurgerKing.objectRepo.HamBurgerPage;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class BaseClass {

	public AppiumDriverLocalService service;
	public AndroidDriver driver;
	public static AndroidDriver sDriver;
	public HomePage homePageObj;
	public NutritionInfoPage nutritionInfoPageObj;
	public SavedAddressesPage savedAddressesPageObj;
	public HamBurgerPage hamBurgerPage;
	public AndroidUtility androidUtility ;
	public GestureUtility gestureUtility;
	public FileUtility fileUtility = new FileUtility();
	public ExcelUtility excelUtility = new ExcelUtility();

	public int portNumber;


	@BeforeSuite(groups = {"smoke", "regression"})
	public void startServer()
	{
		File file = new File("C:\\Users\\adity\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js");
	
		service = new AppiumServiceBuilder()
				.withAppiumJS(file)
				.withIPAddress("127.0.0.1")
				.usingPort(4723)
			//	.usingAnyFreePort()
				.withTimeout(Duration.ofSeconds(300))
				.build();

		service.start();
		
		System.out.println("Appium server stared======>");

	}

	@BeforeClass(groups = {"smoke", "regression"})
	public void launchApp() throws IOException
	{

		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("platformName", fileUtility.readDataFromPropFile("platformName"));
		cap.setCapability("automationName", fileUtility.readDataFromPropFile("automationName"));
		cap.setCapability("deviceName", fileUtility.readDataFromPropFile("deviceName"));
		cap.setCapability("Udid", fileUtility.readDataFromPropFile("UdId"));
		cap.setCapability("ignoreHiddenApiPolicyError", true);
		cap.setCapability("autoGrantPermissions", true);
		cap.setCapability("noReset", true);

		cap.setCapability("appPackage", fileUtility.readDataFromPropFile("appPackage"));


		URL url = new URL("http://localhost:4723");
		driver = new AndroidDriver(url, cap);
		sDriver=driver;
		UtilityClassObject.setDriver(driver);

		System.out.println("Application started=====>");

		
		

	}

	@BeforeMethod(groups = {"smoke", "regression"})
	public void login() throws IOException
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}

	@AfterMethod(groups = {"smoke", "regression"})
	public void logout() throws IOException, InterruptedException
	{

	}

	@AfterClass(groups = {"smoke", "regression"})
	public void closeApp() throws IOException, InterruptedException
	{
		androidUtility= new AndroidUtility(driver);
		androidUtility.terminateApp(fileUtility.readDataFromPropFile("appPackage"));
		System.out.println("Application closed=====>");
	}

	@AfterSuite(groups = {"smoke", "regression"})
	public void stopServer()
	{
		service.stop();
		System.out.println("Appium server closed======>");
	}



}
