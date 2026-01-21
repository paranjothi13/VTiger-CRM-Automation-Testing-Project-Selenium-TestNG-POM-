package practice;

import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class TestNGPractice {
//@Ignore
@Test(priority=-1)
	public void createUser() {
		System.out.println("User is created");
	}
	@Test(priority=1,invocationCount = 2)
	public void modifyUser() {
	//	Assert.fail();
		System.out.println("user is modified");
	}
	@Test(priority='a',dependsOnMethods = {"createUser","modifyUser"})
	public void deleteUser() {
		System.out.println("user is deleted");
	}
}
