package TestNG.TestNG.ExtentReport;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;

	@BeforeClass (description = "BROWSER SETUP")
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
	}

	@AfterClass (description = "BROWSER TEAR DOWN")
	public void tearDown() {
//		String methodName = result.getName();
//		if(!result.isSuccess()){
//		    File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		    try {
//		    	FileUtils.copyFile(scrFile, new File("image/png"));
//		        } catch (IOException e1) {
//		            e1.printStackTrace();
//		        }
//		    }
		
		driver.close();
	}

	
}
