package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class screenshot_of_entire_webpage {
	public static void main(String[] args) throws IOException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		TakesScreenshot ts=(TakesScreenshot) driver;
		File temp=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./Screenshot/img1.png");
		FileHandler.copy(temp, dest);		
	}

}
