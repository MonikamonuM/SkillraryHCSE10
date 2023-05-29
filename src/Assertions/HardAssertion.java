package Assertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertion {
	
	@Test
	public void test1() {
		String s1="Hello";
		String s2="hello";
		Assert.assertEquals(s1, s2);
		
		System.out.println(s1);
		System.out.println(s2);
	}
	@Test
	public void test2() {
		System.out.println("test2");
	}

}
