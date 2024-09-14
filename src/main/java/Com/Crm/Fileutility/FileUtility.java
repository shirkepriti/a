package Com.Crm.Fileutility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileUtility {
	public  String getDataFromEXcelSheet(String sheetName,int row,int cell) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream("F:\\eclipse\\Com.Crm.DemowebShop\\src\\test\\resources\\DemoWebShop.xlsx");
		Workbook w= WorkbookFactory.create(fis);
		Sheet s = w.getSheet(sheetName);
		Row r = s.getRow(row);
		Cell cl = r.getCell(cell);
		String value = cl.getStringCellValue();
		return value;
	}
}

