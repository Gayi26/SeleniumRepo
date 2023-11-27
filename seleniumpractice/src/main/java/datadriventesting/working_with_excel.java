package datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class working_with_excel {
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException
	{
		FileInputStream fis=new FileInputStream("./testdata/Book1.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		String url = workbook.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		String email = workbook.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		String password = workbook.getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();
		System.out.println(url);
		System.out.println(email);
		System.out.println(password);
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get(url);
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		driver.findElement(By.xpath("//input[@id=\"Email\"]")).sendKeys(email);
		driver.findElement(By.xpath("//input[@id=\"Password\"]")).sendKeys(password);
		driver.quit();
		
	}

}
