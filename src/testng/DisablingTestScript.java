package testng;

import org.testng.annotations.Test;

public class DisablingTestScript {
	
	@Test(enabled=false)
	public void demo() {
		System.err.println("demo");
	}

}
