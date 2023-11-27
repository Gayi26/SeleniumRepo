package working_with_suites;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Navigate_to_amazon {
	@Test
	public void demowebshop()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Reporter.log("launched amazon",true);
		driver.quit();
	}
}
//hold control and select class..testng..convert to testng
//for parallel execution just provide parallel="classes"


