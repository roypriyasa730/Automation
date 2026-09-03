package testngScripts;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
@Test(priority=5,dependsOnMethods="deleteCoustomer")
public void createCoustomer() {

	Reporter.log("Coustomer Create successfully",true);
	
}

@Test(priority=4)
public void deleteCoustomer() {
	Assert.fail();
	Reporter.log("Coustomer Deleted successfully",true);
}
@Test(priority=3)
public void addcreateCoustomer() {
	Reporter.log("Coustomer Add successfully",true);
}
@Test(priority=0,invocationCount=5)
public void updateCoustomer() {
	Reporter.log("Coustomer Update successfully",true);
}
@Test(priority=1)
public void modifyCoustomer() {
	Reporter.log("Coustomer Modify successfully",true);
}
@Test(priority=2)
public void vrifyCoustomer() {
	Reporter.log("Coustomer Vrify successfully",true);
}

}
