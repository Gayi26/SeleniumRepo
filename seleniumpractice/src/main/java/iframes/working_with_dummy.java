package iframes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class working_with_dummy {
	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://online.actitime.com/asdf/administration/userlist.do?submitted=");
		driver.findElement(By.xpath("//input[@id=\"username\"]")).sendKeys("gayathriroyalpoola@gmail.com");
		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("Gayi@26102001");
		driver.findElement(By.xpath("//a[@id=\"loginButton\"]")).click();
		//Thread.sleep(15);
		//driver.findElement(By.xpath("//div[text()='Users']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//tr[@class=\"userListRow\"]/../..//td[@class=\"userNameCell first\"]")).click();
		driver.findElement(By.xpath("//span[@class=\"userNameSpan\"]")).click();
		driver.findElement(By.xpath("//span[@class=\"userNameSpan\"]")).click();
		Thread.sleep(20000);
		driver.findElement(By.xpath("//span[text()='PERMISSIONS']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//div[contains(@class,\"userPanel_permissionRow\")])[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[contains(@class,\"userPanel_permissionRow\")])[2]")).click();
		List<WebElement> ele = driver.findElements(By.xpath("//div[contains(@class,\"userPanel_permissionRow\")]"));
		int count=0;
		String attributevalue;
		for(WebElement name:ele)
		{
			if(count<=7)
			{
			Thread.sleep(5000);
			attributevalue = name.getAttribute("class");
			System.out.println(attributevalue);
			if(attributevalue.equals("userPanel_permissionRow inactive"))
			{
				System.out.println("element is disabled");
			}
			else
			{
				System.out.println("element is enabled");
			}
			
			count++;
			}
		}
		
	
		driver.close();
	}

}
