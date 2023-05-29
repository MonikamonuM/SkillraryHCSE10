package chapter2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("gifts");
		Thread.sleep(2000);
		List<WebElement> list= driver.findElements(By.xpath("//div[contains(@aria-label='gifts')]"));
		for(WebElement e : list) {
			System.out.println(e.getText());
		}
		Thread.sleep(2000);
		driver.close();
		}

	}


