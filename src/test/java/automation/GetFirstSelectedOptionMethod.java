package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetFirstSelectedOptionMethod {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://demowapp.apipulse.com/");

        Thread.sleep(3000);

        driver.findElement(By.xpath("//section[text()='Dropdown']")).click();

        Thread.sleep(2000);

        WebElement element = driver.findElement(By.id("select-multiple-native"));

        Select s = new Select(element);

        s.selectByContainsVisibleText("Petite");

        s.selectByVisibleText("DANVOUY Womens T Shirt");

        Thread.sleep(1000);

        s.selectByIndex(10);

        s.selectByValue("fjallraven - foldsack no. 1 backpack, fits 15 laptops");

        Thread.sleep(3000);

        WebElement allOptions = s.getFirstSelectedOption();

        String option = allOptions.getText();

        System.out.println(option);

        Thread.sleep(3000);

        driver.quit();
    }
}
