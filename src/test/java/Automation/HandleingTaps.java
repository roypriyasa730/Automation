package Automation;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleingTaps {
	public static void main(String[] args) throws InterruptedException {
		WebDriver d= new ChromeDriver();
		
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.manage().window().maximize();
		d.get("https://demoapps.qspiders.com/ui?scenario=1");
		
		d.findElement(By.xpath("//section[text()='Popups']")).click();
		
		d.findElement(By.xpath("//section[text()='Browser Windows']")).click();
		d.findElement(By.xpath("//a[text()='New Tab']")).click();
		d.findElement(By.xpath("//h2[text()='Laptop']/following-sibling::button")).click();
		Set<String> alltapid=d.getWindowHandles();
		Iterator<String> itr=alltapid.iterator();
		String ptab=itr.next();
		String ctab=itr.next();
		d.switchTo().window(ctab);
		d.findElement(By.xpath("//h1[text()='High-Performance Laptop']"));
		System.out.println();
		Thread.sleep(3000);
		d.switchTo().window(ptab);
		Thread.sleep(3000);
		d.quit();

}
}