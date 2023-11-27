package Working_With_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class xpath_by_multiple_attributes {
	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com/");
		driver.findElement(By.xpath("//input[contains(@placeholder,'Search for products')and @class='desktop-searchBar']")).click();
		driver.get("https://www.myntra.com/men-tshirts");
		driver.findElement(By.xpath("//label[text()='Tshirts']/..//div[@class='common-checkboxIndicator']")).click();
		//for svg
		driver.findElement(By.xpath("(//span[text()='Levis Mens Regular Fit Tee'])[1]/../..//*[name()='svg']"));
		}

}
