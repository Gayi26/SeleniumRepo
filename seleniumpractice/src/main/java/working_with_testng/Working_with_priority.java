package working_with_testng;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Working_with_priority {
	//default priority=-1
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
	@Test(priority=-1)
	public void skillrary()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://skillrary.com/");
		Reporter.log("launched skillary",true);
		driver.quit();
	}
	//lower the value first will be the execution
	//if we have duplicate priorities,then the execution will be
	//according to alphabetical order
	

}
