package Working_With_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Working_With_Id {
	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/login");
		WebElement id=driver.findElement(By.id("Email"));
		if(id.isDisplayed())
		{
		System.out.println(id);
		id.sendKeys("gayi");
		}
		
		driver.close();
		
	}

}
