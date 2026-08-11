package Automation;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingChild {
public static void main(String[] args) {
	WebDriver d= new ChromeDriver();
	
	d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	d.manage().window().maximize();
	d.get("https://demoapps.qspiders.com/ui?scenario=1");
	
	d.findElement(By.xpath("//section[text()='Popups']")).click();
	
	d.findElement(By.xpath("//section[text()='Browser Windows']")).click();

	d.findElement(By.xpath("//a[text()='New Window']")).click();

	d.findElement(By.xpath("//h2[text()='Watches']/following-sibling::button[text()='view more']")).click();

	Set<String> allwin = d.getWindowHandles();
	Iterator<String> itr = allwin.iterator();
	String pwin = itr.next();
	String cwin = itr.next();
	String c2win = itr.next();


	d.switchTo().window(cwin);


	d.findElement(By.xpath("//button[text()='Add to Cart']")).click();

	d.quit();
	
}
}
