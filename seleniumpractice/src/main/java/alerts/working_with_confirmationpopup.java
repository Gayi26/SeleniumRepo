package alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class working_with_confirmationpopup {
	public static void main(String[] args)
	{ 
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.xpath("//input[@name=\"cusid\"]")).sendKeys("123");
		driver.findElement(By.xpath("//input[@name=\"submit\"]")).click();
		Alert popup = driver.switchTo().alert();
		System.out.println(popup.getText());
		popup.accept();
		popup.dismiss();
	
	}

}
