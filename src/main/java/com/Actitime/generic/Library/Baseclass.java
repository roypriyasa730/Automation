package com.Actitime.generic.Library;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Baseclass {

    public static WebDriver driver;

    FileUtility f = new FileUtility();

    @BeforeSuite
    public void connectwithdatabase() {

        Reporter.log("database connected successfully", true);
    }

    @BeforeTest
    public void launchBrowser() throws IOException {

        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        String url = f.readDataFromProperty("Url");

        driver.get(url);

        Reporter.log("browser is launched and navigated to actitime", true);
    }

    @BeforeMethod
    public void logintoactitime() throws IOException {

        String un = f.readDataFromProperty("Username");

        driver.findElement(By.id("username")).sendKeys(un);

        String pw = f.readDataFromProperty("Password");

        driver.findElement(By.name("pwd")).sendKeys(pw);

        driver.findElement(By.xpath("//div[text()='Login ']")).click();

        Reporter.log("logged in to actitime successfully", true);
    }

    @AfterMethod
    public void logoutfromactitime() {

        driver.findElement(
                By.xpath("//button[@data-testid='popup_menu_button_profile']")
        ).click();

        driver.findElement(
                By.xpath("//div[text()='Logout']")
        ).click();

        Reporter.log("logged out successfully", true);
    }

    @AfterTest
    public void closebrowser() {

        driver.close();

        Reporter.log("browser closed successfully", true);
    }

    @AfterSuite
    public void disconnectfromdatabase() {

        Reporter.log("database disconnected successfully", true);
    }
}