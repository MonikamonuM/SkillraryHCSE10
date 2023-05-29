package chapter2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement kids=driver.findElement(By.xpath("//a[text()='Kids' and @class]"));
		Actions a=new Actions(driver);
		a.moveToElement(kids).perform();
		driver.findElement(By.xpath("//a[text()='Soft Toys']")).click();
		WebElement header=driver.findElement(By.xpath("//div[@class='filter-summary-filter']"));
		if(header.getText().contains("Soft Toys"))
			System.out.println("Test Pass");
		else
			System.out.println("Test Fail");
		driver.close();

	}

}
