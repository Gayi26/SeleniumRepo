package alerts;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Working_with_childwindow {
	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.shoppersstack.com/products_page/7");
		Thread.sleep(20000);
		driver.findElement(By.id("compare")).click();   
		Set<String> allwindowid = driver.getWindowHandles();
		for(String id:allwindowid)
		{
			System.out.println(id);
			driver.switchTo().window(id);
			if(driver.getCurrentUrl().contains("amazon"))
			{
				driver.manage().window().maximize();
			}
		}
	}

}
