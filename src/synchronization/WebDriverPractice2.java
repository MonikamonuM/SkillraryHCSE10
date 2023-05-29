package synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverPractice2 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement loginButton=driver.findElement(By.xpath("//button[.='Log in']"));
		WebDriverWait wait=new WebDriverWait(driver,5);
		try {
			wait.until(ExpectedConditions.elementToBeClickable(loginButton)).click();
		}catch(Exception e) {
				System.out.println("Disabled");
			}
			driver.close();

	}
}


