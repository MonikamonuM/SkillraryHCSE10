package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://accounts.snapchat.com/accounts/v2/login");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@autocomplete='username']")).sendKeys("gdtehdu");
		driver.findElement(By.xpath("//a[contains(text(),'number')]")).sendKeys("8765398275");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.close();
		
		
	}

	
}
