package automation;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class FileDownloadpopup {

	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.facebook.com/");
		Robot r=new Robot();
		 r.keyPress(KeyEvent.VK_META);
	        r.keyPress(KeyEvent.VK_S);

	        r.keyRelease(KeyEvent.VK_S);
	        r.keyRelease(KeyEvent.VK_META);

	        Thread.sleep(2000);

	        r.keyPress(KeyEvent.VK_ENTER);
	        r.keyRelease(KeyEvent.VK_ENTER);

	        Thread.sleep(5000);

	        driver.quit();
		}

}
