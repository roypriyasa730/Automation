package testngScripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
@Test
public void Test1() {

	Reporter.log("Test1 execute",true);

	
}

@Test
public void Test2() {
	Reporter.log("Test2 execute",true);
}
@Test
public void Test3() {
	Reporter.log("Test3 execute",true);
}
}
