package datadriventesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteDataToExcel1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		//step1:convert physical file into java readable object
		FileInputStream fis=new FileInputStream("./testresources/TestData.xlsx");
		//step2:open workbook
		//workbookFactory.create(fis);throws EncryptedDocumentException,IOException
		Workbook wb=WorkbookFactory.create(fis);
		
		//step3:get control over sheet
		Sheet sh=wb.getSheet("Sheet1");
		
		//step4:Get Row
		Row r=sh.getRow(4);
		
		//step5:Write to cell
		Cell c=r.createCell(1);
		c.setCellValue("Selenium");
		
		//step6:Save
		FileOutputStream fos=new FileOutputStream("./testresources/TestData.xlsx");
		wb.write(fos);
		
		//step7:Close workbook
		wb.close();
	}

}
