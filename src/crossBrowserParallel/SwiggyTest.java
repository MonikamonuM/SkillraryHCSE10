package crossBrowserParallel;

import org.testng.annotations.Test;

public class SwiggyTest {
	
	@Test
	public void swiggy(){
		driver.get("https;//www.swiggy.com/");
		Thread.sleep(3000);
	}

}
