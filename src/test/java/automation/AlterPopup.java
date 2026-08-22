package automation;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlterPopup {

	public static void main(String[] args)throws InterruptedException {
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://demoapps.qspiders.com/ui?scenario=1");
        driver.findElement(By.xpath("//section[text()='Popups']")).click();
        driver.findElement(By.xpath("//section[text()='Javascript']")).click();
        driver.findElement(By.xpath("//td[text()='Levis Shirt']/preceding-sibling::td")).click();

        driver.findElement(By.id("deleteButton")).click();

        Alert a = driver.switchTo().alert();
        a.accept();  
        driver.quit();
	
    }
	}


