package Locators;
/*
 * *scenario:
 * open the browser
 * enter flipkart.com
 * type iphones and click on search
 * fetch list of iphones from first page
 * close the browser
 */

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassNameLocator2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		driver.findElement(By.className("_2doB4z")).click();
		driver.findElement(By.name("q")).sendKeys("iphones");
		driver.findElement(By.className("L0Z3Pu")).click();
		
		java.util.List<WebElement> iphoneList = driver.findElements(By.className("_4rR01T"));
		for(WebElement iphone : iphoneList) {
			String name=iphone.getText();
			System.out.println(name);
		}
		
		driver.close();
																																	
 		

	}

}
