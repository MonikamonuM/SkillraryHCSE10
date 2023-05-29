package groupexecution;

public class Test1 {
	@Test(groups="Smoke")
	public void tc1() {
		System.out.println("Test1-Smoke");
	}
	@Test(groups="System")
	public void tc2() {
		System.out.println("Test1-System");
	}
	@Test(groups= {"Smoke","System"})
	public void tc3() {
		System.out.println("Test1- Smoke and System");
	}
	
	}


