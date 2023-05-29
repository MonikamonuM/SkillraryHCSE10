package popups;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopup {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		WebElement searchTF=driver.findElement(By.name("q"));
		searchTF.sendKeys("iphones");
		driver.findElement(By.className("L0Z3Pu")).click();
				
		driver.findElement(By.xpath("//div[text()='APPLE iPhone 13 (Blue, 128 GB)']")).click();
		String parentID=driver.getWindowHandle();
		Set<String> ids=driver.getWindowHandles();
		
		for(String id:ids) {
			driver.switchTo().window(id);
		}
		String rating=driver.findElement(By.xpath("//span[text()='APPLE iPhone 13 (Blue, 128 GB)']/ancestor::div[@class='aMaAEs']/descendant::div[@class='_3LWZlK']")).getText();
		System.out.println(rating);
		driver.close();
		
		driver.switchTo().window(parentID);
		Thread.sleep(2000);
		searchTF.clear();
		searchTF.sendKeys("smart watch");
		driver.findElement(By.className("L0Z3Pu")).click();
		Thread.sleep(2000);
		driver.close();
		}
		

	}


