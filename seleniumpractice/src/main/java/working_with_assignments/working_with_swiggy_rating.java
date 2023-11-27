package working_with_assignments;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class working_with_swiggy_rating {
public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("https://www.swiggy.com/");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	   WebElement element = driver.findElement(By.xpath("//input[@id=\"location\"]"));
	   element.sendKeys("jayanagr");
	   Thread.sleep(4000);
	    Actions action= new Actions(driver);
	    action.sendKeys(Keys.ARROW_DOWN).perform();
	    action.sendKeys(Keys.ENTER).perform();
	     System.out.println("Executed");
	    driver.findElement(By.xpath("//a[@class=\"sc-lbJcrp bdhRZE\"]")).click();
	   driver.findElement(By.xpath("//div[text()='Filter']")).click();
	    driver.findElement(By.xpath("//label[text()='Rating']")).click();
	    driver.findElement(By.xpath("//div[text()='Apply']")).click();
	   // List<WebElement> items = driver.findElements(By.xpath("//span[@class=\"sc-aXZVg jxDVMd\"]"));
	    ArrayList<String> ob = new ArrayList<>();
        for (WebElement i : driver.findElements(By.xpath("//span[@class=\"sc-aXZVg jxDVMd\"]"))) {
        	Thread.sleep(2000);
        	
            String ratings = i.getText();
            String[] updated = ratings.split(",");
            for (int j = 0; j < updated.length; j++) {
                updated[j] = updated[j].substring(0, updated[j].length() - 1);
            }
            ob.addAll(Arrays.asList(updated));
        }
        ArrayList<Double> doubleList = new ArrayList<>();
        for (String rating : ob) {
            doubleList.add(Double.parseDouble(rating));
        }
        Collections.sort(doubleList, Collections.reverseOrder());
        System.out.println(doubleList);
	    List<WebElement> items1 = driver.findElements(By.xpath("//span[@class=\"sc-aXZVg jxDVMd\"]"));
	    Thread.sleep(2000);
        ArrayList<String> ob1 = new ArrayList<>();
        for (WebElement i : items1) {
            String ratings = i.getText();
            String[] updated = ratings.split(",");
            for (int j = 0; j < updated.length; j++) {
                updated[j] = updated[j].substring(0, updated[j].length() - 1);
            }
            ob1.addAll(Arrays.asList(updated));
        }
        System.out.println(ob1);
        boolean res=ob.equals(ob1);
		if(res==true)
		{
			System.out.println("Food displayed is according to rating");
		}
		else
		{
			System.out.println("Food displayed is not accroding to rating");
		}
        driver.quit();	    
   }
}
