package dataDrivenTesting;

import java.awt.Desktop;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadDataFromProperty {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver=new ChromeDriver();
		 FileInputStream fis = new FileInputStream(
	                "./src/test/resources/Testsdata/customerapitestingdata.xlsx");
	        File file = new File ("./src/test/resources/Testsdata/customerapitestingdata.xlsx");
	        Desktop.getDesktop().open(file);
		        p.load(fis);

		        String data = p.getProperty("url");
		        System.out.println(p.getProperty("browser"));

		        Thread.sleep(6000);

		        driver.quit();
		    } 
		
	}

