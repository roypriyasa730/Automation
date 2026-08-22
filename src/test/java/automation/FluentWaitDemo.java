package automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class FluentWaitDemo{

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://demoapps.qspiders.com/ui/dropdown?sublist=0");
	    FluentWait<WebDriver> wait = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(10));

	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//section[text()='Dropdown']")));
	
	driver.findElement(By.xpath("//section[text()='Dropdown']")).click();

  

   
    driver.quit();
}

}
