package testng;

import org.testng.annotations.Test;

public class Test1 {
	
	@Test(priority=-1, invocationCount=3)
	public void testcase1() {
		System.out.print("Test Case 1");
	}
	@Test(priority=2, enabled=false)
	public void testcase2() {
		System.out.print("Test Case 2");
	}
	@Test(priority=-1, enabled=false)
	public void testcase3() {
		System.out.print("Test Case 3");
	}
	@Test(priority=-1, invocationCount=0)
	public void testcase4() {
		System.out.print("Test Case 4");
	}
	@Test
	public void testcase5() {
		System.out.print("Test Case 5");
	
	}

}
