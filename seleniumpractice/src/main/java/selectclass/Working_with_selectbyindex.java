package selectclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Working_with_selectbyindex {
	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement day = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select a=new Select(day);
		a.selectByIndex(6);
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		Select b=new Select(month);
		b.selectByValue("6");
		WebElement year = driver.findElement(By.xpath("//select[@id=\"year\"]"));
		Select c=new Select(year);
		c.selectByVisibleText("2016");
		
	}
	

}
