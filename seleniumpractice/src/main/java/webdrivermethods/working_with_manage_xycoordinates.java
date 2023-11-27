package webdrivermethods;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class working_with_manage_xycoordinates {
	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		Point position=driver.manage().window().getPosition();
		System.out.println(position.getX());
		System.out.println(position.getY());
		driver.manage().window().setPosition(new Point(100,200));
		
	}

}
