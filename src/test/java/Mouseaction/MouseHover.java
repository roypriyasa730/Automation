package Mouseaction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException {
        WebDriver d= new ChromeDriver();
        d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.manage().window().maximize();
		d.get("https://www.vtiger.com/");
		WebElement element = d.findElement(By.id("companyDropdown"));
		Actions a =new Actions(d);
		a.moveToElement(element).perform();
		d.findElement(By.xpath("//a[text()='Contact Us']")).click();
	String phone=	d.findElement(By.xpath("//p[contains(text(),'9243602352')]")).getText();
	System.out.println(phone);
	Thread.sleep(4000);
	d.quit();

	}

}
