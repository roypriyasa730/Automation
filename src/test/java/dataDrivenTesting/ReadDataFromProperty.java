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
		
		FileInputStream fis = new FileInputStream("./src/test/resources/Testdata/config.properties");
		        Properties p = new Properties();

		        p.load(fis);

		        String data = p.getProperty("url");
		        System.out.println(p.getProperty("browser"));

		        Thread.sleep(6000);

		        driver.quit();
		    } 
		
	}

