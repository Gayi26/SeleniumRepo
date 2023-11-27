package selectclass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class working_with_select_options {
	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement box = driver.findElement(By.xpath("//select[@id=\"cars\"]"));
		Select a=new Select(box);
		List<WebElement> options = a.getOptions();
		for(WebElement ele:options)
		{
			System.out.println(ele.getText());
		}
		int size=a.getOptions().size();
		a.selectByIndex(1);
		a.selectByIndex(2);
		WebElement firstoption = a.getFirstSelectedOption();
		System.out.println(firstoption);
		List<WebElement> alloptions = a.getAllSelectedOptions();
		for(WebElement allopt:alloptions)
		{
			allopt.click();
			System.out.println(allopt.getText());
		}
	}

}
