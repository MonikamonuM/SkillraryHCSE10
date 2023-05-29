package javascriptexecution;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PassDateAndClickElement {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement searchTF=driver.findElement(By.id("twotabsearchtextbox"));
		WebElement searchButton=driver.findElement(By.id("nav-search-submit-button"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].value=arguments[1]",searchTF,"shoes");
		js.executeScript("arguments[0].click()",searchButton);
		Thread.sleep(2000);
		driver.close();

	}

}
