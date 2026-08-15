package Mouseaction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		
		 WebDriver d= new ChromeDriver();
	        d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			d.manage().window().maximize();
			d.get("https://demoapps.qspiders.com/ui?scenario=1");
			d.findElement(By.xpath("//section[text()='Mouse Actions']")).click();
			d.findElement(By.xpath("//section[text()='Drag & Drop']")).click();
			d.findElement(By.xpath("//a[text()='Drag Position']")).click();
			 WebElement src = d.findElement(By.xpath("//div[text()='Mobile Charger']"));
			 WebElement dest = d.findElement(By.xpath("//div[text()='Mobile Accessories']"));
			 Actions a=new Actions(d);
			 a.dragAndDrop(src, dest).perform();
			 Thread.sleep(4000);
		    	d.quit();
			
	}

}
