package actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement courselink=driver.findElement(By.id("course"));
		Actions a=new Actions(driver);
		a.moveToElement(courselink).perform();
		driver.findElement(By.xpath("//span/a[text()='Selenium Training']")).click();
		WebElement value=driver.findElement(By.id("quantity"));
		int initialQuantity=Integer.parseInt(value.getAttribute("value"));
		
		WebElement plusButton=driver.findElement(By.id("add"));
		a.doubleClick(plusButton).perform();
		
		int finalQuantity=Integer.parseInt(value.getAttribute("value"));
		
		if(finalQuantity==initialQuantity+1)
			System.out.println("Quantity increased-pass");
		else
			System.out.println("fail");
		driver.close();
	}

}
