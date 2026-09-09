package dataDrivenTesting;


	import java.io.IOException;
	import java.time.Duration;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class CreateClass {
		public static void main(String[] args) throws IOException, InterruptedException {
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			methodCreation m = new methodCreation();
			String url = m.readDataFromProperty("url");
			driver.get(url);
			String un = m.readDataFromProperty("username");
			driver.findElement(By.id("username")).sendKeys(un);
			String pwd = m.readDataFromProperty("password");
			driver.findElement(By.name("pwd")).sendKeys(pwd);
			driver.findElement(By.xpath("//div[text()='Login '] ")).click();
			driver.findElement(By.xpath("//span[text()='Tasks']")).click();
			driver.findElement(By.xpath("//div[@class='addNewButton']")).click();
			driver.findElement(By.xpath("//div[text()='New Customer']")).click();
	        methodCreation m1= new methodCreation();
	      String name = m1.readDataFromExcel("sheet1", 2, 1);
			driver.findElement(By.xpath("//input[@class='inputFieldWithPlaceholder newNameField inputNameField']")).sendKeys(name);
			String desc = m1.readDataFromExcel("sheet1", 2, 2);
			driver.findElement(By.xpath("//textarea[@placeholder='Enter Customer Description']")).sendKeys(desc);
			driver.findElement(By.xpath("//div[text()='Create Customer']")).click();
			Thread.sleep(3000);
			driver.quit();
		}
	    
	}

