package working_with_assignments;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;
public class enter_otp_in_single_box {
	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		ChromeOptions settings=new ChromeOptions();
		settings.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(settings);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://www.myntra.com/");
		Actions a=new Actions(driver);
		WebElement profile = driver.findElement(By.xpath("//span[text()='Profile']"));
		a.moveToElement(profile).perform();
		driver.findElement(By.xpath("//a[text()='login / Signup']")).click();
		driver.findElement(By.xpath("//input[@autocomplete=\"new-password\"]")).sendKeys("9849874345");
		driver.findElement(By.xpath("//div[@class=\"submitBottomOption\"]")).click();
		Thread.sleep(30000);
		driver.findElement(By.xpath("//div[@class=\"submitBottomOption\"]")).click();
		List<WebElement> otptextfield = driver.findElements(By.xpath("//div[@class=\"otpContainer\"]/../..//input[@type=\"tel\"]"));
		String otp="1234";
		System.out.println(otptextfield.size());
		String res="";
		if(otptextfield.size()==otp.length())
		{
			for (int i = 0; i < otp.length(); i++) {
                String no = String.valueOf(otp.charAt(i));
                otptextfield.get(i).sendKeys(no);
                res="entered successfully";
            }
		}
		else
		{
			res="failed to enter";
		}
		System.out.println(res);
		driver.quit();	
	}
}
