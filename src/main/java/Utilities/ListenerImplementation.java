package Utilities;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerImplementation implements ITestListener{
	
	@Override
	public void onTestFailure(ITestResult result)
	{
		String methodName = result.getMethod().getMethodName();
		TakesScreenshot ts = (TakesScreenshot)BaseClass.sDriver;
		
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dstn = new File("./Screenshot/failedTest"+"_"+methodName+".png");
		
//		src.renameTo(dstn);
	
		
		try {
			FileHandler.copy(src, dstn);
		} catch (IOException e) {
		
			e.printStackTrace();
		}
	}
	
	

}
