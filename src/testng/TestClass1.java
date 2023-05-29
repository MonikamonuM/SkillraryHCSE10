package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestClass1 extends BaseClass {
	
	@Test
	public void tc1() {
		Reporter.log("@Test", true);
		}

}
