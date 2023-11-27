package WebElement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Working_with_getrect {
	public static void main(String[] args)
	{
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/login");
	Rectangle rect = driver.findElement(By.id("Email")).getRect();
	System.out.println(rect.getHeight());
	System.out.println(rect.getWidth());
	System.out.println(rect.getX());
	System.out.println(rect.getY());
	}

}
