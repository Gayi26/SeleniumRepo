package WebElement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Working_With_Click_sendkeys 
{
	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/login");
		//driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("mobiles",Keys.ENTER);
		driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("mobiles");
		driver.findElement(By.xpath("//input[@id='small-searchterms']")).submit();
		
	}
	
	
}


