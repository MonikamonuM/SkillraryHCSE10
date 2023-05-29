package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelectorPractice2 {

	public static void main(String[] args) throws InterruptedException  {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com/");
		driver.findElement(By.cssSelector("input.searchformInput")).sendKeys("smart watches");
		driver.findElement(By.cssSelector("span.searchTextSpan")).click();
		if(driver.getCurrentUrl().contains("watches"))
			System.out.println("Test Pass");
		else
			System.out.println("Test Fail");
		Thread.sleep(3000);
		driver.close();
		
	}

}
