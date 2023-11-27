package alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class working_with_hiddendivision {
	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		
		driver.findElement(By.xpath("//span[@class=\"commonModal__close\"]")).click();
		Thread.sleep(5000);
		WebElement popup = driver.findElement(By.xpath("//iframe[contains(@name,\"notification-frame\")]"));
		Thread.sleep(5000);
		driver.switchTo().frame(popup);
		driver.findElement(By.xpath("//i[@class=\"wewidgeticon we_close\"]")).click();
		driver.switchTo().defaultContent();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id=\"departure\"]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[text()='November 2023']/../..//p[text()='18']")).click();
		
	}

}
