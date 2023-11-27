package working_with_testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Working_with_enabled {
	//by default the value will be true if
	//we provide as false then that test case
	//will be skipped
	//or we can make invocation count=0, then the test case will
	//be skipped 
	@Test
	public void demowebshop()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Reporter.log("launched demo webshop",true);
		driver.quit();
	}
	@Test(enabled=false)
	public void skillrary()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://skillrary.com/");
		Reporter.log("launched skillary",true);
		driver.quit();
	}
	

}
