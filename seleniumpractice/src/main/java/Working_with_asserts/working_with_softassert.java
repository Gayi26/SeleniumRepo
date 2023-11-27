package Working_with_asserts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

public class working_with_softassert {
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/login");
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		driver.findElement(By.id("Email")).sendKeys("jennie213@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Jennie@12");
		driver.findElement(By.xpath("//input[@value=\"Log in\"]")).click();
		SoftAssert Assert=new SoftAssert();
		Assert.assertEquals(driver.getTitle(),"Demo Web","user logged in successfully");
		Assert.assertEquals(driver.getTitle(),"Demo Web Shop","user logged in successfully");
		Reporter.log("user logged in",true);
		Assert.assertAll();//IN ORDER TO GET THE EXCEPTIONS//NO NEED FOR HARD ASSERT
		//IF WE DONT CALL ASSERTALL EVEN IF THE SCRIPT IS FAILED IT WILL NOT GIVE ERROR
	}

}
