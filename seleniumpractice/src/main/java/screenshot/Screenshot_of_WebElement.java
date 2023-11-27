package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshot_of_WebElement {
	public static void main(String[] args) throws IOException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		File temp=driver.findElement(By.xpath("//img[@alt='Tricentis Demo Web Shop']")).getScreenshotAs(OutputType.FILE);
		File dest=new File("./Screenshot/elementImage.png");
		FileHandler.copy(temp, dest);
		
	}

}
