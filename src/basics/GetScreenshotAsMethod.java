package basics;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetScreenshotAsMethod {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.swiggy.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement signUp=driver.findElement(By.xpath("//a[text()='Sign up']"));
		File src=signUp.getScreenshotAs(OutputType.FILE);
		File dest=new File("./ElementScreenshot/signUp.png");
		FileUtils.copyFile(src,dest);
		driver.close();

	}

}
