package testngScripts;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Actitime.generic.Library.Baseclass;

@Listeners(ListenerImplementation.class)
public class BaseClassUtilization extends Baseclass{
	@Test
	public void clickOnTasks() {
					driver.findElement(By.xpath("//span[text()='Tas']")).click();
			Reporter.log("clicked on Task",true);
	}
	
	@Test
	public void clickOnSetting() {
		driver.findElement(By.xpath("//span[text()='Reports']")).click();
		Reporter.log("Clicked on Reports",true);
	}

}