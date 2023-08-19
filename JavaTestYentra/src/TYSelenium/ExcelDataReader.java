package TYSelenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelDataReader {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		DataReader("Sheet1");
	}
	public static void DataReader(String sheet_name) throws EncryptedDocumentException, IOException {
		File file = new File("./Excel/Practice.xlsx");
		FileInputStream fis = new FileInputStream(file);
		Workbook wb = WorkbookFactory.create(fis);
		//String sheet_name = wb.getSheetName(0);
		int row=wb.getSheet(sheet_name).getLastRowNum();
		int row_count = wb.getSheet(sheet_name).getPhysicalNumberOfRows();
		int col_count = wb.getSheet(sheet_name).getRow(1).getPhysicalNumberOfCells();
		System.out.println(row_count);
		for (int i = 0; i <row_count; i++) {
			for (int j = 0; j <col_count; j++) {
				String data=wb.getSheet(sheet_name).getRow(i).getCell(j).toString();
				System.out.print(data+"\t");
			}
			System.out.println();
		}
	}

}
