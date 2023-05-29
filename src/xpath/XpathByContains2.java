package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByContains2 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		String text=driver.findElement(By.xpath("//h2[contains(text(),'Facebook ')]")).getText();
		System.out.println(text);
		driver.close();

		
	}

}
