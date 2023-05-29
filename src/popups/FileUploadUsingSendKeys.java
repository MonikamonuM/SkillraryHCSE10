package popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadUsingSendKeys {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.foundit.in/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[contains(text(),'Upload Resume')]"));
		driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\Admin\\Desktop\\MonikaMCV.docx");
		Thread.sleep(2000);
		driver.close();
		
		
		

	}

}
