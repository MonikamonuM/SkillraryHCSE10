package actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FramesPractice {

	public static void main(String[] args){
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement signIn=driver.findElement(By.className("accountUserName"));
		Actions a=new Actions(driver);
		a.moveToElement(signIn).perform();
		
		driver.findElement(By.xpath("//a[text()='login']")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.id("userName")).sendKeys("6758935657");
		driver.findElement(By.id("close-pop")).click();
		driver.switchTo().defaultContent();
		driver.findElement(By.name("keyword")).sendKeys("shoes");
		driver.findElement(By.className("searchTextSpan")).click();
		
        String header=driver.findElement(By.xpath("//div[@id='searchMessageContainer']/descendant::span")).getText();
		 if(header.contains("shoes"))
			System.out.println("pass");
		else
			System.out.println("fail");
		driver.close();
		

	}

}
