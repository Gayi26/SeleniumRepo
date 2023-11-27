package selectclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Working_with_multipleselect {
	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement box = driver.findElement(By.xpath("//select[@id=\"cars\"]"));
		Select a=new Select(box);
		a.selectByIndex(3);
		a.selectByValue("299");
		a.selectByVisibleText("Free ( 90 ) ");
		driver.close();
	}

}
