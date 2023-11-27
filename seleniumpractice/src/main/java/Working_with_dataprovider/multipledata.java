package Working_with_dataprovider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class multipledata {
	@DataProvider
	public  String[][]data()
	{
		String[][] arr= {{"lisa12@gmail.com","lisa123"},{"jennie12@gmail.com","jennie12"}};
		return arr;
	}
	@Test(dataProvider="data")
	public void login(String[] values)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/login");
		driver.findElement(By.id("Email")).sendKeys(values[0]);
		driver.findElement(By.id("Password")).sendKeys(values[1]);
		driver.quit();
		
	}

}
