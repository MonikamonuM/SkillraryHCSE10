package batchexecution;

public class TestClass4 {
	@Test
	public void test1() {
		System.out.println("TestClass4=> test1");
	}
	@Test
	public void test2() {
		System.out.println("TestClass4=> test2");
		Assert.fail();

}
