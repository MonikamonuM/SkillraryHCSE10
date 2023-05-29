package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class sampletestNG {

	@Test
	public void demo() {
		Reporter.log("Hello World", true);
		
	}
}
