package datadriventesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActitimeLoginScript {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(readData("url"));
		long time=Long.parseLong(readData("time"));
		
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
		
		driver.findElement(By.id("username")).sendKeys(readData("UN1"));
		driver.findElement(By.name("pwd")).sendKeys(readData("PWD1"));
		driver.findElement(By.id("loginButton")).click();
		
		WebDriverWait wait=new WebDriverWait(driver,time);
		boolean status=wait.until(ExpectedConditions.titleContains("Enter Time-Track"));
		if(status)
			System.out.println("Pass");
		else
			System.out.println("Fail");
		driver.close();
	}
	public static String readData(String key) {
		FileInputStream fis=null;
		try {
			fis=new FileInputStream("./testresources/data.properties");
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		Properties property=new Properties();
		try {
			property.load(fis);
		}catch(IOException e) {
			e.printStackTrace();
			
		}
		return property.getProperty(key);		
			
			
		}
			
	}


