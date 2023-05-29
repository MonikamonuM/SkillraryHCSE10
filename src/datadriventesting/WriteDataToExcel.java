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

public class WriteDataToExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		//step1:convert physical file into java readable object
				FileInputStream fis=new FileInputStream("./testresources/TestData.xlsx");
				//step2:open workbook
				//workbookFactory.create(fis);throws EncryptedDocumentException,IOException
				Workbook wb=WorkbookFactory.create(fis);
				
				//step3:get control over sheet
				Sheet sh=wb.getSheet("Sheet1");
				
				//step4:Create new Row
				Row r=sh.createRow(4);
				
				//step5:Create new Cell
				Cell c=r.createCell(0);
				
				//step6:Write to cell
				c.setCellValue("Tool");
				
				//step7:save
				FileOutputStream fos=new FileOutputStream("./testresources/TestData.xlsx");
				wb.write(fos);
				
				//step8:Close Workbook
				wb.close();
				

	}

}
