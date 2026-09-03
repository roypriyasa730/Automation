package testngScripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
@Test
public void createCoustomer() {

	Reporter.log("Coustomer Create successfully",true);
	
}

@Test
public void deleteCoustomer() {
	Reporter.log("Coustomer Deleted successfully",true);
}
@Test
public void addcreateCoustomer() {
	Reporter.log("Coustomer Add successfully",true);
}
@Test
public void updateCoustomer() {
	Reporter.log("Coustomer Update successfully",true);
}
@Test
public void modifyCoustomer() {
	Reporter.log("Coustomer Modify successfully",true);
}
@Test
public void vrifyCoustomer() {
	Reporter.log("Coustomer Vrify successfully",true);
}

}
