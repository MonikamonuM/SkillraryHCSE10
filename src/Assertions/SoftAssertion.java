package Assertions;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion {
	
	@Test
	public void test1() {
		SoftAssert soft=new SoftAssert();
		String s1="Hello";
		String s2="hello";
		soft.assertEquals(s1, s2);
		
		System.out.println(s1);
		System.out.println(s2);
		soft.assertAll();
	}
	@Test
	public void test2() {
		System.out.println("test2");
	}

}
