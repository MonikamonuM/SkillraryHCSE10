package dropdowns;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Prractice1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement dropdown=driver.findElement(By.id("cars"));
		Select s=new Select(dropdown);
		List<WebElement> list=s.getOptions();
		for(WebElement e:list) {
			System.out.println(e.getText());
			
		}
		if(s.isMultiple()) {
			s.selectByIndex(0);
			s.selectByIndex(1);
			s.selectByIndex(2);
			Thread.sleep(3000);
			
			System.out.println("/nFirst option:"+s.getFirstSelectedOption().getText());
			System.out.println("/nAll Selected options:");
			List<WebElement> selectedList=s.getAllSelectedOptions();
			for(WebElement opt:selectedList) {
				System.out.println(opt.getText());
				
			}
			Thread.sleep(3000);
			s.deselectAll();
			
		}
		else {
			System.out.println("single-select");
			
		}
		Thread.sleep(3000);
		driver.close();
}

}
