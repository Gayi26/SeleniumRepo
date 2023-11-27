package Working_with_parameters;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class crossbrowser {
	public WebDriver driver;
	@Parameters("browser")
	@Test
	public void demo(String Browser)
	{
		if(Browser.equals("chrome"))
		{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/login");
		}
		else if(Browser.equals("firefox"))
		{
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/login");
		}
		else if(Browser.equals("edge"))
		{
		driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/login");
		}
	}

}
