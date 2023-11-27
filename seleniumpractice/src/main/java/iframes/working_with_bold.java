package iframes;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class working_with_bold {
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.espncricinfo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(200));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		Thread.sleep(20000);
		driver.findElement(By.xpath("//button[text()='Not Now']")).click();
		WebElement cricketInfo = driver.findElement(By.xpath("//a[@href=\"https://www.espncricinfo.com/series/icc-cricket-world-cup-2023-24-1367856\"]"));
		Actions act =new Actions(driver);
		act.moveToElement(cricketInfo).perform();
		Thread.sleep(10000);
		String font=cricketInfo.getCssValue("font-weight");
		if(font.equals("700"))
		{
			System.out.println("element is bold");
		}
		else
		{
			System.out.println("element is not bold");
		}
		driver.close();
	}

}
