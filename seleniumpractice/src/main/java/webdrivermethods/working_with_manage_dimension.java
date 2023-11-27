package webdrivermethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class working_with_manage_dimension {
	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		Dimension size=driver.manage().window().getSize();
		System.out.println(size.getHeight());
		System.out.println(size.getWidth());
		driver.manage().window().maximize();
		Dimension size1=driver.manage().window().getSize();
		System.out.println(size.getHeight());
		System.out.println(size1.getWidth());
		driver.manage().window().setSize(new Dimension(300,300));		
	}

}
