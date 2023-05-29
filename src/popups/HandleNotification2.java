package popups;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandleNotification2 {

	public static void main(String[] args) throws InterruptedException {
		HashMap<String, Integer> contentSettings=new HashMap<>();
		HashMap<String, Object> profile=new HashMap<>();
		HashMap<String, Object> preference=new HashMap<>();
		
		contentSettings.put("geolocation", 1);
		contentSettings.put("notifications", 2);
		contentSettings.put("media_stream", 1);
		
		profile.put("managed_default_content_settings", contentSettings);
		preference.put("profile", profile);
		ChromeOptions options=new ChromeOptions();
		options.setExperimentalOption("prefs", preference);
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://webcamtests.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("webcam-launcher")).click();
		Thread.sleep(3000);
		driver.close();

	}

}
