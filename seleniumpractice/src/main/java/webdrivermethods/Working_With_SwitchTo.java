package webdrivermethods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Working_With_SwitchTo {
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
			driver.switchTo().window(id);
			System.out.println(driver.getCurrentUrl());
			if(driver.getCurrentUrl().equals("https://www.flipkart.com/"))
			{
				System.out.println(driver.getPageSource());
				//driver.switchTo().window("https://www.flipkart.com/");
				break;
				}
			driver.close();
		}
	}

}
