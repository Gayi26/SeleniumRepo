package webdrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class working_with_navigate {
	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		driver.navigate().to("https://www.instagram.com/");
		driver.navigate().to(new String("https://www.instagram.com/"));
		driver.navigate().refresh();
		driver.get("https://skillrary.com/");
		driver.navigate().back();
		driver.navigate().forward();
	}

}
