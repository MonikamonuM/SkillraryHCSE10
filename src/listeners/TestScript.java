package listeners;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listeners.ListenersImplementation.class)
public class TestScript extends BaseClass {
	
	@Test
	public void test() {
		System.out.println("Test");
	}

}
