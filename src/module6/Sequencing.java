package module6;

import org.testng.annotations.Test;

public class Sequencing {

	@Test(priority = 0)
	public void Sugandh() {
		System.out.println("This is the Test Case 1");
	}

	@Test(priority = 1, enabled = true)
	public void Kanika() {
		System.out.println("This is the Test Case 2");
	}

	@Test(priority = 2)
	public void Thrishna() {
		System.out.println("This is the Test Case 3");
	}

	@Test(priority = 3)
	public void Tai() {
		System.out.println("This is the Test Case 4");
	}
	
	@Test(priority = 4)
	public void Madhava() {
		System.out.println("This is the Test Case 5");
	}
}
