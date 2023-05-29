package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdAndNameLocatorsPractice {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("ajhitkh");
		driver.findElement(By.id("pass")).sendKeys("yuhaftg");
		driver.findElement(By.name("login")).click();
		
		Thread.sleep(4000);
		driver.close();
		 
		

	}

}
