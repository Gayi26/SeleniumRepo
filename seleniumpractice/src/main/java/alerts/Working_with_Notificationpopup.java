package alerts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Working_with_Notificationpopup {
	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		ChromeOptions settings=new ChromeOptions();
		settings.addArguments("--disable-notifications");//allow,block
		settings.addArguments("--incognito");
		WebDriver driver=new ChromeDriver(settings);
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		driver.close();
	}

}
