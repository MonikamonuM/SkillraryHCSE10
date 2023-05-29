package crossBrowserParallel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseClass {
	
	protected WebDriver driver;
	@Parameters("BROWSER")
	
	@BeforeClass
	public void classCongig(String browser) {
		switch(browser) {
		case "chrome":
			driver=new ChromeDriver();
			break;
		case "firefox":
			driver=new FirefoxDriver();
			break;
		case "edge":
			System.setProperty("webdriver.edge.driver", "./msedgedriver.exe");
			driver=new EdgeDriver();
			break;
			default:
				System.out.println("Inavlid browser info");
		}
		driver.manage().window().maximize();
		}
	    @AfterClass
	    public void classtearDown() {
	    	driver.close();
	}

}
