package WebElement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Working_with_cssvalue {
	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/login");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		Thread.sleep(2000);
		String color=driver.findElement(By.xpath("//span[contains(text(),'Login was unsuccessful.')]")).getCssValue("color");
		System.out.println(color);
	}

}
