package DataDriven;

import java.io.FileInputStream;
import java.io.IOException; 

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Practice {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		  FileInputStream fis =new FileInputStream("./Excel/Practice.xlsx"); 
			
			  Workbook wb = WorkbookFactory.create(fis); Sheet sheet =
			  wb.getSheet("Sheet1"); Row row=sheet.getRow(1); Cell cell = row.getCell(1);
			  String val= cell.getStringCellValue(); System.out.println(val);
			  System.out.println(val.toString());
			  
			  FileInputStream fis1 =new FileInputStream("./Excel/Practice.xlsx");
			  System.out.println(WorkbookFactory.create(fis1).getSheet("Sheet1").getRow(2).getCell(2).getDateCellValue() );
			 
			/*
			 * Properties pr=new Properties(); pr.load(fis); String url =
			 * pr.getProperty("pwd"); System.out.println(url);
			 */
	}

}
