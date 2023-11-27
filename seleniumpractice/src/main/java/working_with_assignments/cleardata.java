package working_with_assignments;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.time.Duration;
public class cleardata {
    public static void main(String[] args) {
        try{
            ChromeOptions options = new ChromeOptions();
            WebDriver driver = new ChromeDriver(options);
            driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
            WebElement userName = driver.findElement(By.xpath("//input[@name='username']"));
            WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
            userName.sendKeys("Admin");
            password.sendKeys("admin123");
            WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
            login.click();
            WebElement PIM = driver.findElement(By.xpath("//span[normalize-space()='PIM']"));
            PIM.click();
            WebElement add= driver.findElement(By.xpath("//button[normalize-space()='Add']"));
            add.click();
            WebElement firstName=driver.findElement(By.xpath("//input[@placeholder='First Name']"));
            firstName.sendKeys("Shreshta");
           WebElement middleName= driver.findElement(By.xpath("//input[@placeholder='Middle Name']"));
           middleName.sendKeys("U");
           WebElement lastName=driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
           lastName.sendKeys("Shreenivas");
          WebElement empId= driver.findElement(By.xpath("//label[text()='Employee Id']/../..//div/input"));
          empId.sendKeys(Keys.CONTROL + "a");
          empId.sendKeys(Keys.DELETE);
          empId.sendKeys("3336");
          Thread.sleep(5000);
          WebElement save=driver.findElement(By.xpath("//button[@type='submit']"));
          save.click();
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
