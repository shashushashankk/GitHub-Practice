package TYSelenium;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class apaachiexceel {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./data/sss.xlsx");
		Workbook wd = WorkbookFactory.create(fis);
		@SuppressWarnings("unused")
		String data = wd.getSheet("").getRow(2).getCell(0).getStringCellValue();
		wd.getSheet("").getRow(2).getCell(0).setCellValue("hoi");
		FileOutputStream fos = new FileOutputStream("");
		wd.write(fos);
		wd.close();
	}
}