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
		Properties p = new Properties();
		FileInputStream fis = new FileInputStream
				( "./src/test/resources/Testsdata/customerdata.properties");

		p.load(fis);
		String url = p.getProperty("url"); 
		System.out.println(url); fis.close();
		}
	}