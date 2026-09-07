package genericLibrary;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseClass {

    public WebDriver driver;

    FileUtility f = new FileUtility();

    @BeforeSuite
    public void connectWithDatabase() {

        Reporter.log("Database connected successfully", true);

    }

    @BeforeTest
    public void launchBrowser() {

        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        String URL = f.readDataFromProperty("url");

        driver.get(URL);

        Reporter.log("Browser launched and navigated to Actitime", true);
    }
    @BeforeMethod
    public void loginToActitime() throws IOExeption {

        String un = f.readDataFromProperty("username");

        driver.findElement(By.id("username")).sendKeys(un);

        String pw = f.readDataFromProperty("password");

        driver.findElement(By.name("pwd")).sendKeys(pw);

        driver.findElement(By.xpath("//div[text()='Login ']")).click();

        Reporter.log("Logged in to Actitime successfully", true);
    }
    @AfterMethod
    public void LogoutFromActitime() {
    	driver.findElement(By.xpath(""));
    }
}