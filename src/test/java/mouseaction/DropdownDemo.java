package mouseaction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownDemo {

    public static void main(String[] args) throws InterruptedException {

        WebDriver d = new ChromeDriver();

        d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        d.manage().window().maximize();

        d.get("https://www.facebook.com/r.php");

        WebElement month = d.findElement(By.id("month"));

        Select s = new Select(month);
        Select s = new Select(month);

        s.selectByVisibleText("May");

        Thread.sleep(3000);

        d.quit();
    }
}