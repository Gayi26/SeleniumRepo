package working_with_assignments;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Working_with_swiggy {
public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("https://www.swiggy.com/");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	   WebElement element = driver.findElement(By.xpath("//input[@id=\"location\"]"));
	   element.sendKeys("jayanagar");
	   Thread.sleep(4000);
	    Actions action= new Actions(driver);
	    action.sendKeys(Keys.ARROW_DOWN).perform();
	    action.sendKeys(Keys.ENTER).perform();
	     System.out.println("Executed");
	    driver.findElement(By.xpath("//a[@class=\"sc-lbJcrp bdhRZE\"]")).click();
	    Thread.sleep(2000);
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
        System.out.println(doubleList);
        boolean res=true;
        for(int i=1;i<doubleList.size();i++)
        {
        	double rating=doubleList.get(0);
        	if(doubleList(i)>rating)
        	{
        		res=false;
        		System.out.println("items are not according to rating");
        	}	
        }
        if(res==true)
        {
        	System.out.println("items are according to rating");
        }
        
            driver.quit();	    
   }

private static double doubleList(int i) {
	// TODO Auto-generated method stub
	return 0;
}


}
