package WebElement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Working_with_size {
	public static void main(String[] args)
	{
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/login");
	Dimension size = driver.findElement(By.id("Email")).getSize();
	System.out.println(size.getHeight());
	System.out.println(size.getWidth());
	}

}
