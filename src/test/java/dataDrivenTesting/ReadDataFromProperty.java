package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadDataFromProperty {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		FileInputStream fis = new FileInputStream("./src/test/resources/Testdata/commondata.propertise.rtf");
		        Properties p = new Properties();

		        p.load(fis);

		        String data = p.getProperty("url");
		        
		        driver.get(data);

		        String un = p.getProperty("username");
		        driver.findElement(By.id("username")).sendKeys(un);

		        String pwd = p.getProperty("password");
		        driver.findElement(By.name("pwd")).sendKeys(pwd);

		        driver.findElement(By.xpath("//div[text()='Login']")).click();

		        Thread.sleep(6000);

		        driver.quit();
		    }
		
	}

