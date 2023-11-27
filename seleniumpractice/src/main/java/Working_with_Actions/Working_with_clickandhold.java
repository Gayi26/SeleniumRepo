package Working_with_Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Working_with_clickandhold {
	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://yonobusiness.sbi/login/yonobusinesslogin");
		driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("hello");
		WebElement hiddenpassword = driver.findElement(By.xpath("//div[@class=\"showPassword shownhide\"]"));
		Actions a=new Actions(driver);
		a.clickAndHold(hiddenpassword).perform();
		
	}

}
