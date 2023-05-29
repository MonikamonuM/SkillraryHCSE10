package datadriventesting;

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
		//step1:convert physical file into java readable object
		FileInputStream fis=new FileInputStream("./testresources/TestData.xlsx");
		//step2:open workbook
		//workbookFactory.create(fis);throws EncryptedDocumentException,IOException
		Workbook wb=WorkbookFactory.create(fis);
		
		//step3:get control over sheet
		Sheet sh=wb.getSheet("Sheet1");
		
		//step4:get control over row
		Row r=sh.getRow(1);
		
		//step5:Get control over cell
		Cell c=r.getCell(1);
		
		//step6:Read data from cell
		System.out.println(c.getStringCellValue());
		
		//step7:Close excel
		wb.close();
	}

}
