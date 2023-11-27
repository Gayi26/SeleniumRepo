package webdrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Working_With_getcurrenturl {
	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		String url=driver.getCurrentUrl();
		System.out.println(url);
		if(url.equals(url))
		{
			System.out.println("user navigated");
		}
		else
		{
			System.out.println("user failed to navigate");
		}
	}

}
