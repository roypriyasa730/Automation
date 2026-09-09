package dataDrivenTesting;


	import java.io.IOException;
	import java.time.Duration;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class LoginToActitime {
		public static void main(String[] args) throws IOException, InterruptedException {
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	        methodCreation m= new methodCreation();
	        String URL = m.readDataFromProperty("url");
	        driver.get(URL);
	        String un = m.readDataFromProperty("username");
	        driver.findElement(By.id("username")).sendKeys(un);
	        String pwd = m.readDataFromProperty("password");
	        driver.findElement(By.name("pwd")).sendKeys(pwd);
	        driver.findElement(By.xpath("//div[text()='Login']")).click();
	        Thread.sleep(3000);
	        driver.quit();        
		}
	}

