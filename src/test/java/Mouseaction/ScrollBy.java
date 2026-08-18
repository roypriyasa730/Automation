package Mouseaction;


		import java.time.Duration;

		import org.openqa.selenium.By;
		import org.openqa.selenium.JavascriptExecutor;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.chrome.ChromeDriver;

		public class ScrollBy {

			public static void main(String[] args) throws InterruptedException {
				
		        WebDriver driver = new ChromeDriver();

		        driver.manage().window().maximize();
		        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		        driver.get("https://www.bbc.com/");

		      
		        JavascriptExecutor j = (JavascriptExecutor) driver;

		        Thread.sleep(3000);
		        j.executeScript("window.scrollTo(0,document.boby.scrollHeight)");

		        j.executeScript("window.scrollTo(0,0)");

		        Thread.sleep(3000);

		        driver.quit();
		    }

			

	}


