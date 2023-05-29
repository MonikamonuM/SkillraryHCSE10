package abc;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetWindowSize {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.ebay.com/");
		Dimension d=new Dimension(1080, 720);
		driver.manage().window().setSize(d);
		Thread.sleep(3000);
		driver.close();

	}

}
