package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadDataFromProperty {
	public static void main(String[] args) throws IOException {
		FileInputStream file=new FileInputStream("./src/test/resources/Testsdata/config.properties");
		Properties p= new Properties();
		p.load(file);
		String data = p.getProperty("url");
		System.out.println(data);
	}

}