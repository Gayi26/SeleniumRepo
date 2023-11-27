package selectclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class working_with_dream11 {
	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.dream11.com/");
		driver.findElement(By.xpath("//input[@id=\"regEmail\"]")).click();
		driver.findElement(By.xpath("//a[@id=\"regUser\"]")).click();
		WebElement message = driver.findElement(By.xpath("//label[@id=\"errorMob\"]"));
		System.out.println(message.getText());

	}

}
