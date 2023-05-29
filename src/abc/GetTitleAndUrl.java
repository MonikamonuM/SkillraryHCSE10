package abc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleAndUrl {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.fipkart.com/");
		String title=driver.getTitle();
		String url=driver.getCurrentUrl();
		System.out.println(title);
		System.out.println(url);
		

	}

}
