package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Winid {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		String winid=driver.getWindowHandle();
		System.out.println(winid);
		Thread.sleep(5000);
		driver.quit();

	}

}
