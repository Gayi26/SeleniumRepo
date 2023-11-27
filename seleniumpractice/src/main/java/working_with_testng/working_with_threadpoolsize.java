package working_with_testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class working_with_threadpoolsize {
	//if we want to execute same test case multiple times but
	//simultaneously
	//without invocationcount we cannot use threadpoolsize
	//by default threadpoolsize value is 0
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
	@Test(priority=0,invocationCount=2,threadPoolSize=2)
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
