package Automation;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseChildWindows {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://demoapps.qspiders.com/ui?scenario=1");
	    driver.findElement(By.xpath("//section[text()='Popups']")).click();
        driver.findElement(By.xpath("//section[text()='Browser Windows']")).click();
        driver.findElement(By.xpath("//a[text()='Multiple Windows']")).click();
        driver.findElement(By.xpath("//button[text()='Shop Now']")).click();
        String parentId = driver.getWindowHandle(); //parent window id
        Set<String> allWinId = driver.getWindowHandles();
     // Close only child windows
        for (String id : allWinId) {
       if(!id.equals(parentId)) {
    	   driver.switchTo().window(id);
    	   driver.close();
    	   }
        }

	}
	
}

