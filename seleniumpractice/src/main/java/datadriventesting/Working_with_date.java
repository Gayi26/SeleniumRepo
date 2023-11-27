package datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Working_with_date {
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException
	{
		FileInputStream fis=new FileInputStream("./testdata/Book1.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		LocalDateTime date = workbook.getSheet("Sheet1").getRow(1).getCell(3).getLocalDateTimeCellValue();
		double number = workbook.getSheet("Sheet1").getRow(1).getCell(4).getNumericCellValue();
		int updated_no=(int)number;
		boolean status = workbook.getSheet("Sheet1").getRow(1).getCell(5).getBooleanCellValue();
		System.out.println(date);
		System.out.println(updated_no);
		System.out.println(status);
		System.out.println(date.getMonth());
		System.out.println(date.getDayOfMonth());
		System.out.println(date.getYear());
	}
	}


