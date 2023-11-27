package Working_with_extent;

import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class add_screenshot_in_extentreport {
	@Test
	public void screenshot()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.shoppersstack.com/products_page/7");
		LocalDateTime systime = LocalDateTime.now();
		String time = systime.toString().replace(":", "-");
		TakesScreenshot ts=(TakesScreenshot)driver;
		String screen = ts.getScreenshotAs(OutputType.BASE64);//capture scrrenshotin form of string
		//create instance for extentspark reporter
		ExtentSparkReporter spark=new ExtentSparkReporter("./Worldcup/extentreport"+time+".html");
		//create instance for extent reports
		ExtentReports report=new ExtentReports();
		//attach spark reports inside extent reports
		report.attachReporter(spark);
		//create extest instance to log messages(
		ExtentTest test = report.createTest("screenshot");//test case name
		//call log to log messages inside extent reports
		test.log(Status.PASS, "added screenshot");
		//call flush to write statement inside destination location
		test.addScreenCaptureFromBase64String(screen);
		report.flush();
	}

}
