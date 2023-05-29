package batchexecution;

public class TestClass3 {
	@Test
	public void test1() {
		System.out.println("TestClass3=> test1");
	}
	@Test
	public void test2() {
		System.out.println("TestClass3=> test2");
		Assert.fail();

}
