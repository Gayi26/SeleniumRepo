package iframes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class working_with_framebyname {
	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.get("https://www.dream11.com/");
		Thread.sleep(5000);
		driver.switchTo().frame("send-sms-iframe");
		driver.findElement(By.xpath("//input[@id=\"regEmail\"]")).click();
		//WebElement email = driver.findElement(By.xpath("//input[@id=\"regEmail\"]"));
		//driver.switchTo().frame(email);
		//email.click();
		driver.switchTo().defaultContent();
		/*WebElement lang = driver.findElement(By.xpath("//select[@id=\"language_selection_new\"]"));
		wait.until(ExpectedConditions.visibilityOf(lang));
		Select a=new Select(lang);
		a.selectByIndex(1);*/
		driver.findElement(By.xpath("//div[@id=\"menu_parent\"]")).click();
	}

}
