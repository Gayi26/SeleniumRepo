package WebElement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Working_with_isdisplayed {
	public static void main(String[] args) throws InterruptedException
	{
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	Thread.sleep(10000);
	driver.get("https://www.instagram.com");
	WebElement button = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
	System.out.println(button.isDisplayed());
	System.out.println(button.isEnabled());
	}

}
