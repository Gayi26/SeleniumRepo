package working_with_testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Working_with_dependsonmethods {
	@Test
	public void register()
	{
		//Assert.fail();to intentionally fail
		Reporter.log("User registered successfully",true);
	}	
	@Test(dependsOnMethods="register")
	public void login()
	{
		Reporter.log("user logged in successfully",true);
	}
}
/*Batch execution:
 * Executing multiple classes or test scripts in one shot
 * executing classes via testng.xml
 * create a suite and run that suite file*/
