package xpath;

import org.openqa.selenium.By;

/*scenario:
 * open the browser
 * enter demo.actitime.com
 * click on 'forget your password'
 * click on 'return to login page'
 * close the browser
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathBy {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Forgot your password?']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Return to login page']")).click();
		Thread.sleep(3000);
		driver.close();
			

	}

}
