package datadriventesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActitimeLoginUsingExcel {

	public static void main(String[] args) {
		Map<String,String> map=readFromExcel();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(map.get("url"));
		long time=Long.parseLong(map.get("time"));
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
		
		driver.findElement(By.id("username")).sendKeys(map.get("username"));
		driver.findElement(By.name("pwd")).sendKeys(map.get("password"));
		driver.findElement(By.id("loginButton")).click();
		
		WebDriverWait wait=new WebDriverWait(driver,time);
		wait.until(ExpectedConditions.titleContains("Enter Time-Track"));
		
		driver.close();
		}
	
	public static Map<String, String> readFromExcel() {
		FileInputStream fis=null;
		try {
			fis=new FileInputStream("./testresources/TestData.xlsx");
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		Workbook wb=null;
		try {
			wb=WorkbookFactory.create(fis);
		}catch(EncryptedDocumentException | IOException e) {
			e.printStackTrace();
		}
		Sheet sheet=wb.getSheet("Sheet1");
		
		Map<String,String> map=new HashMap<>();
		DataFormatter df=new DataFormatter();
		
		for(int i=0; i<=sheet.getLastRowNum(); i++) {
			String Key=df.formatCellValue(sheet.getRow(i).getCell(0));
			String value=df.formatCellValue(sheet.getRow(i).getCell(1));
			
			map.put(Key, value);
		}
		System.out.println(map);
		return map;
			
			
		}
	}


