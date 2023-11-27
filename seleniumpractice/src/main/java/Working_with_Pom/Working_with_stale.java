package Working_with_Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Working_with_stale {
	public static void main(String[] args)
	{

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		welcomepage wp= new welcomepage(driver);
		wp.getVoteButton().click();
		driver.switchTo().alert().accept();
		driver.navigate().refresh();
		wp.getVoteButton().click();
		driver.quit();
	}

}
