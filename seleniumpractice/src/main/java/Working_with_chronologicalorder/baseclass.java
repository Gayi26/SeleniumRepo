package Working_with_chronologicalorder;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class baseclass {
	public WebDriver driver;
	@BeforeSuite
	public void configreports()
	{
		//db connections//sql
		Reporter.log("configure reports", true);
	}
	@AfterSuite
	public void flushreports()
	{
		Reporter.log("flush reports", true);
	}
	@BeforeClass
	public void browsersetup()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/");
	}
	@AfterClass
	public void closebrowser()
	{
		driver.quit();
	}
	@BeforeMethod
	public void login()
	{
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		driver.findElement(By.id("Email")).sendKeys("jennie213@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Jennie@12");
		driver.findElement(By.xpath("//input[@value=\"Log in\"]")).click();
	}
	@AfterMethod
	public void logout()
	{
		driver.findElement(By.xpath("//a[text()='Log out']")).click();
	}

}
