package TYSelenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcel {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		readExcel();
	}
	public static void readExcel() throws EncryptedDocumentException, IOException {
		File file = new File("./Excel/Practice.xlsx");
		FileInputStream fis = new FileInputStream(file);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("Sheet1");
		Row row = sheet.getRow(1);
		Cell cell = row.getCell(2);
		//System.out.println(cell.toString());
		for (int i = 0; i <=sheet.getLastRowNum(); i++) {
			for (int j =0; j <row.getLastCellNum(); j++) {
				System.out.print(wb.getSheet("Sheet1").getRow(i).getCell(j).toString()+"\t");
				}
			System.out.println();
		}
	}
}
