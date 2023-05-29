package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassNameLocator {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com/");
		Thread.sleep(2000);
		driver.findElement(By.className("searchformInput")).sendKeys("smart watches");
		driver.findElement(By.className("searchTextSpan")).click();
		Thread.sleep(2000);
		driver.close();

	}

}
