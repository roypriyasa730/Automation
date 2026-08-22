package mouseaction;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;

public class DisabledElement {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://demoapps.qspiders.com/ui/");

        driver.findElement(By.xpath("//h1[text()='Disabled']")).click();

        WebElement address = driver.findElement(By.id("name"));

        JavascriptExecutor j = (JavascriptExecutor) driver;

        Thread.sleep(3000);

        j.executeScript("arguments[0].value='Priyasa roy';", address);

        Thread.sleep(3000);

        j.executeScript("arguments[0].value='';", address);

        Thread.sleep(5000);

        driver.quit();
    }
}