package alerts;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Working_with_childwindow2 {
	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.shoppersstack.com/products_page/7");
		driver.manage().window().maximize();
		Thread.sleep(20000);
		driver.findElement(By.id("compare")).click();  
		String parentid = driver.getWindowHandle();
		Set<String> allwindowid = driver.getWindowHandles();
		allwindowid.remove(parentid);
		for(String id:allwindowid)
		{
			driver.switchTo().window(id);
			driver.close();//to close all windows except parentwindow
		}
	}

}
