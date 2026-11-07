package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://trytestingthis.netlify.app/");
		driver.manage().window().maximize();
		Select dropdown = new Select(driver.findElement(By.id("option")));
		dropdown.selectByVisibleText("Option 2");
		driver.quit();
	}

}
