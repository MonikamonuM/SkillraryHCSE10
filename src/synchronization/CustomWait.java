package synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomWait {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//button[text()='Start']")).click();
		int count=0;
		WebElement header=null;
		while(count<20) {
			try {
				header=driver.findElement(By.xpath("//h4[text()='Hello World!']"));
				break;
			}catch(Exception e) {
				count++;
				Thread.sleep(2000);
			}
		}
		System.out.println(header.getText());
		driver.close();

	}

}
