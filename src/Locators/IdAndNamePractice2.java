package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * Scenario
 * open the browser
 * enter demo.actitime.com
 * enter user name as 'admin' and password as 'manager'
 * click on login
 * validate into home page
 * close the browser
 */
public class IdAndNamePractice2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(3000);
		if(driver.getTitle().contains("Enter Time-Track"))
		System.out.println("Test Pass");
		else
			System.out.println("Test Fail");
		
		driver.close();

	}

}
