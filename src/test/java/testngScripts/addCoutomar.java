package testngScripts;

import org.testng.annotations.Test;

import org.testng.Reporter;

public class addCoutomar {
	@Test(priority = 5, dependsOnMethods = "deleteCoustomer")
	public void createCoustomer() {

		System.out.println("Coustomer Create successfully");
	}

	public void deleteCoustomer() {
		throw new AssertionError();
	}

	public void addcreateCoustomer() {
		System.out.println("Coustomer Add successfully");
	}

	public void updateCoustomer() {
		System.out.println("Coustomer Update successfully");
	}

	public void modifyCoustomer() {
		System.out.println("Coustomer Modify successfully");
	}

	@Test(priority = 2)
	public void vrifyCoustomer() {
		Reporter.log("Coustomer Vrify successfully", true);
	}

}
