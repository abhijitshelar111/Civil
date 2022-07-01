package scrolling;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrollinguse {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\velocity\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(100));
		JavascriptExecutor j= ((JavascriptExecutor)driver);//we need to type cast driver object to javascriptexecutor interface
		//+ve X value--> right hand side Y value +ve-->down
		//+ve X value--> right hand side Y value -ve-->up
		//-ve X value--> left  hand side Y value +ve-->down
		//-ve X value--> left hand side Y value -ve-->up
		j.executeScript("window.scrollBy(60,4000)");
		Thread.sleep(5000);
		j.executeScript("window.scrollBy(60,-2000)");
		

	}

}
