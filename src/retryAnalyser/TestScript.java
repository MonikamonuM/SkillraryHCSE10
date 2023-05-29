package retryAnalyser;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestScript {
	@Test
	public void test1() {
		System.out.println("Test1");
	}
	@Test(retryAnalyzer=retryAnalyser.RetryAnalyserImp.class)
	public void test2() {
		System.out.println("Test2");
		Assert.fail();
		
	}

}
