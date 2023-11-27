package Working_with_Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Working_with_draganddrop {
	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		WebElement images = driver.findElement(By.xpath("//iframe[@data-src=\"../../demoSite/practice/droppable/photo-manager.html\"]"));
		driver.switchTo().frame(images);
		WebElement src1 = driver.findElement(By.xpath("//img[@src='images/high_tatras_min.jpg']"));
		WebElement src2 = driver.findElement(By.xpath("//img[@src='images/high_tatras2_min.jpg']"));
		WebElement src3 = driver.findElement(By.xpath("//img[@src='images/high_tatras4_min.jpg']"));
		WebElement src4 = driver.findElement(By.xpath("//img[@src='images/high_tatras3_min.jpg']]"));
		WebElement dest = driver.findElement(By.xpath("//div[@id='trash']"));
		WebElement gallery = driver.findElement(By.xpath("//*[@id='gallery']"));
		Actions a=new Actions(driver);
		a.dragAndDrop(src1, dest).perform();
		a.dragAndDrop(src2, dest).perform();
		a.dragAndDrop(src3, dest).perform();
		a.dragAndDrop(src4, dest).perform();
		Thread.sleep(2000);
		a.dragAndDrop(src1,gallery).perform();


		
	}

}
