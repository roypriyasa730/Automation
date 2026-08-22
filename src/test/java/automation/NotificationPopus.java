package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NotificationPopus {

	public static void main(String[] args) throws InterruptedException {
		  ChromeOptions options = new ChromeOptions();
	        options.addArguments("--disable-notifications");

	        WebDriver driver = new ChromeDriver(options);
	        driver.manage().window().maximize();
            driver.get("https://www.yatra.com/"); 
	        Thread.sleep(5000);
	        driver.quit();
	
	}

}
