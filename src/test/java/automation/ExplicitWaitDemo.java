package automation;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExplicitWaitDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println("Title: " + driver.getTitle());

		driver.quit();
	}

}
