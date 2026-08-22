package mouseaction;

	import java.time.Duration;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;


	public class Scroll {
	    public static void main(String[] args) throws InterruptedException {

	        WebDriver driver = new ChromeDriver();

	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	        driver.get("https://www.bbc.com/");


	        JavascriptExecutor j = (JavascriptExecutor) driver;

	        Thread.sleep(3000);
	        j.executeScript("window.scrollBy(0,5000)");
	        Thread.sleep(3000);
	        j.executeScript("window.scrollBy(0,-5000)");
	        Thread.sleep(3000);
	        driver.quit();
	    }
	
}
