package DataDriven;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataDriven2 {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./Excel/Practice.xlsx");
		Workbook q = WorkbookFactory.create(fis);
		int s = q.getSheet("sheet1").getLastRowNum();
		for (int i = 0; i < s; i++) {
			String s1 = q.getSheet("Sheet1").getRow(i).getCell(1).getStringCellValue();
			System.out.println(s1);
		}
		System.out.println(q.getSheet("Sheet1").getRow(1).getCell(2).getNumericCellValue());
		System.out.println(q.getSheet("Sheet1").getRow(2).getCell(2).getDateCellValue());
		System.out.println(q.getSheet("Sheet1").getRow(3).getCell(2).getStringCellValue());

		FileInputStream fis1 = new FileInputStream("./Excel/Actitime.txt");
		Properties pr = new Properties();
		pr.load(fis1);
		String l= pr.getProperty("Username");
		System.out.println(l);
	}

}
