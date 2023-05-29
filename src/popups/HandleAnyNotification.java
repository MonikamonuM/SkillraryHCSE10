package popups;

import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandleAnyNotification {

	public static void main(String[] args) {
		HashMap<String, Integer> contentSettings=new HashMap<>();
		HashMap<String, Object> profile=new HashMap<>();
		HashMap<String, Object> preference=new HashMap<>();
		
		contentSettings.put("geolocation", 1);
		contentSettings.put("notifications", 2);
		
		profile.put("managed_default_content_settings", contentSettings);
		preference.put("profile", profile);
		ChromeOptions options=new ChromeOptions();
		options.setExperimentalOption("prefs", preference);
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.ajio.com/");
		

	}

}
