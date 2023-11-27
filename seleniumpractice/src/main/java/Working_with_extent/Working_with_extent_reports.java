package Working_with_extent;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Working_with_extent_reports {
	@Test
	public void demotest()
	{
		//create instance for extentspark reporter
		ExtentSparkReporter spark=new ExtentSparkReporter("./Worldcup/extentreport.html");
		//create instance for extent reports
		ExtentReports report=new ExtentReports();
		//attach spark reports inside extent reports
		report.attachReporter(spark);
		//create extest instance to log messages(
		ExtentTest test = report.createTest("demotest");//test case name
		//call log to log messages inside extent reports
		test.log(Status.INFO, "added log statement inside extent report");
		//call flush to write statement inside destination location
		report.flush();
	}
	

}
