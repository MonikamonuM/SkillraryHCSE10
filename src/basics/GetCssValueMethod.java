package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCssValueMethod {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement createAccount=driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		System.out.println(createAccount.getCssValue("color"));
		System.out.println(createAccount.getCssValue("font"));
		System.out.println(createAccount.getCssValue("background-color"));
		driver.close();
		

	}

}
