package dropdowns;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement dropdown=driver.findElement(By.id("searchDropdownBox"));
		Select s=new Select(dropdown);
		if(s.isMultiple())
			System.out.println("Multi Select dropdown");
		else
			System.out.println("Single Select dropdown");
		
		s.selectByIndex(7);
		Thread.sleep(3000);
		s.selectByValue("search-alias=digital-music");
		Thread.sleep(3000);
		s.selectByVisibleText("Kindle Store");
		Thread.sleep(3000);
		driver.close();
		
			

	}

}
