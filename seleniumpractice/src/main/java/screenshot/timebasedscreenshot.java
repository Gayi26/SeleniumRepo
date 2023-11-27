package screenshot;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class timebasedscreenshot {
	public static void main(String[] args) throws IOException, InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);
		LocalDateTime systemtime = LocalDateTime.now();
		String time=systemtime.toString().replace(":", "-");
		TakesScreenshot ts=(TakesScreenshot) driver;
		File temp1=ts.getScreenshotAs(OutputType.FILE);
		File dest1=new File("./Screenshot/"+time+".png");
		FileHandler.copy(temp1, dest1);
	}

}
