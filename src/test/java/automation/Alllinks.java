package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Alllinks {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//span[@role='button']")).click();
		List<WebElement> alllinks = driver.findElements(By.xpath("//a"));
		int count = alllinks.size();
		System.out.println(count);
		for (int i = 0; i < count; i++) {
			String text = alllinks.get(i).getText();
			System.out.println((i + 1) + ") " + text);
			

		}
	
		driver.quit();
	}
}
