package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElements {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement element=driver.findElement(By.id("twotabsearchtextbox"));
		element.sendKeys("dress");
		Thread.sleep(3000);
		element.clear();
		element.sendKeys("Smart Watches");
		Thread.sleep(3000);
		
		driver.findElement(By.id("nav-search-submit-button")).submit();
		driver.close();

	}

}
