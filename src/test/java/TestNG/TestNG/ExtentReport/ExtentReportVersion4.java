package TestNG.TestNG.ExtentReport;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.aventstack.extentreports.testng.listener.ExtentITestListenerClassAdapter;
import com.aventstack.extentreports.testng.listener.ExtentIReporterSuiteClassListenerAdapter;

//@Listeners({ ExtentIReporterSuiteClassListenerAdapter.class }) //use this if want class level report
public class ExtentReportVersion4 extends BaseClass {

	@Test(priority = 1)
	public void googleSearch() {
		Assert.assertEquals("Google", driver.getTitle());
		driver.findElement(By.name("q")).sendKeys("TestNG Extent" + Keys.ENTER);
	}

	@Test(priority = 2)
	public void backToPage() {
		driver.navigate().back();
	}

	@Test(priority = 3)
	public void forwardToPage() {
		driver.navigate().forward();
	}
}
