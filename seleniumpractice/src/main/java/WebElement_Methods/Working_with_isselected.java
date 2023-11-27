package WebElement_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Working_with_isselected {
	public static void main(String[] args) throws InterruptedException
	{
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	Thread.sleep(10000);
	driver.get("https://www.instagram.com");
	}

}
