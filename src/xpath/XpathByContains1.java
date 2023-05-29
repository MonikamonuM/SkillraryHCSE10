package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByContains1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//img[contains(@alt,'Fitness ')]")).click();
		if(driver.getCurrentUrl().contains("fitness"))
			System.out.println("Test Pass");
		else
			System.out.println("Test Fail");
		Thread.sleep(3000);
		driver.close();
			
	}

}
