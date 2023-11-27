package iframes;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Working_with_cricket1 {
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.espncricinfo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(200));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		//Thread.sleep(20000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Latest cricket updates']")));
		driver.findElement(By.xpath("//button[text()='Not Now']")).click();
		WebElement cricketInfo = driver.findElement(By.xpath("//a[text()='World Cup 2023']"));
		Actions act =new Actions(driver);
		act.moveToElement(cricketInfo).perform();
		//List<WebElement> options = driver.findElements(By.xpath("//li[@class=\"ds-w-full ds-flex\"]"));
		List<WebElement> options = driver.findElements(By.xpath("//li[@title=\"Tour diary\" or @title=\"Fixtures and Results\" or @title=\"Points Table\" or @title=\"Squads\" or @title=\"Videos\" or @title=\"Teams\" or @title=\"Photos\" or @title=\"Records\"]"));
		int count=0;
		ArrayList<String>e1=new ArrayList<>();
		String attributevalue;
		for(WebElement name:options)
		{
			if(count<=7)
			{
			Thread.sleep(2000);
			attributevalue = name.getAttribute("title");
			e1.add(attributevalue);
			//System.out.println(attributevalue);
			}
		}
		System.out.println(e1);
		File file=new File("C:\\Users\\User\\Desktop\\WORLDCUP\\cricket.xlsx"); 
		Workbook book=WorkbookFactory.create(file);
		Sheet sheet=book.getSheet("Sheet1");
		int rowcount=sheet.getPhysicalNumberOfRows()-1;
		int colcount=sheet.getRow(0).getPhysicalNumberOfCells();
		ArrayList<String>e=new ArrayList<>();
		for(int i=0;i<rowcount;i++)
		{
			for(int j=0;j<colcount;j++)
			{
				String value=sheet.getRow(i+1).getCell(j).getStringCellValue();
				e.add(value);
				//System.out.println(value);
			}	
		}
		System.out.println(e);
		boolean res=e1.equals(e);
		if(res==true)
		{
			System.out.println("list is matching the elements with excel");
		}
		else
		{
			System.out.println("list is not matching the elements with excel");
		}
		System.out.println(res);
		driver.quit();		
	}
}
