package Working_with_Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_001 {
	public static void main(String[] args)
	{

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		welcomepage wp= new welcomepage(driver);
		wp.getRegisterLink().click();
		driver.quit();
	}

}
