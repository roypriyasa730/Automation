package Mouseaction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MyntraDragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		 WebDriver d= new ChromeDriver();
	        d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			d.manage().window().maximize();
			d.get("https://www.myntra.com/men-tshirts");
            WebElement element = d.findElement(By.id("rootRailThumbRight"));
			Actions a =new Actions(d);
			a.dragAndDropBy(element, 58, 0).perform();
			 Thread.sleep(4000);
		    	d.quit();
			 
			

	}

}

