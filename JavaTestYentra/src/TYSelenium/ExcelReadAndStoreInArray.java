package TYSelenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class ExcelReadAndStoreInArray {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		ReadFromExcel("Sheet1");

	}
	public static Object[][] ReadFromExcel(String sheet_name) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./Excel/Practice.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		int row_count=wb.getSheet(sheet_name).getPhysicalNumberOfRows();
		int cel_cont=wb.getSheet(sheet_name).getRow(0).getPhysicalNumberOfCells();
		Object [][]arr=new Object[row_count-1][cel_cont-1];
		for (int i = 1; i <row_count; i++) {
			for (int j = 1; j <cel_cont; j++) {
				arr[i-1][j-1]=wb.getSheet(sheet_name).getRow(i).getCell(j).toString();
			}
		}
		for (int i = 0; i <arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		return arr;
	}
}
