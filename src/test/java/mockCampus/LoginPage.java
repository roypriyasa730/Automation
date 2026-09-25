package mockCampus;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://mockcampus.com/");
        driver.findElement(By.xpath("//span[text()='Login / Register']")).click();
        driver.findElement(By.id("student-email")).sendKeys("roypriyasa730.com");
        driver.findElement(By.id("student-password")).sendKeys("Shine@999");
        driver.findElement(By.xpath("//button[contains(.,'Login and continue')]")).click();
        System.out.println("Email and password entered");
        driver.quit();

    }
}
