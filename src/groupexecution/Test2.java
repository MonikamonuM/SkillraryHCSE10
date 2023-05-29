package groupexecution;

public class Test2 {
	@Test(groups="Smoke")
	public void tc1() {
		System.out.println("Test2-Smoke");
	}
	@Test(groups="Regression")
	public void tc2() {
		System.out.println("Test2-Regression");
	}
	@Test(groups= {"Smoke","Regression"})
	public void tc3() {
		System.out.println("Test1- Smoke and Regression");
	}
	

}
