package groupexecution;

public class Test3 {
	@Test(groups="System")
	public void tc1() {
		System.out.println("Test3-System");
	}
	@Test(groups="Regression")
	public void tc2() {
		System.out.println("Test3-Regression");
	}
	@Test(groups= {"System","Regression"})
	public void tc3() {
		System.out.println("Test3- System and Regression");
	}
	

}
