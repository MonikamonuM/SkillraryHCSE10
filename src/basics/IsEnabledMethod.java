package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledMethod {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement login=driver.findElement(By.xpath("//button[.='Log in']"));
		if(login.isEnabled())
			System.out.println("Enabled");
		else
			System.out.println("Disabled");
		driver.findElement(By.name("username")).sendKeys("gsdudjnbi");
		driver.findElement(By.name("password")).sendKeys("busdbbw");
		
		if(login.isEnabled()) {
			System.out.println("Enabled");
			login.click();
		}
		else
			System.out.println("Disabled");
		driver.close();

	}

}
