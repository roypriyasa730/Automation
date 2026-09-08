package testngScripts;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.google.common.io.Files;

public class Capturingscreenshot {

	@Test
	public void CaptureScreenshot() throws IOException, InterruptedException{ 
		WebDriver driver =new ChromeDriver();
		driver .manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.myntra.com/");
		TakesScreenshot t =(TakesScreenshot)driver;
		File Src=t.getScreenshotAs(OutputType.FILE);
		File dest=new File("./Screenshot/ss.png");
		Files.copy(Src, dest);
		Thread.sleep(3000);
		driver.quit();
		
		
	}
	}

