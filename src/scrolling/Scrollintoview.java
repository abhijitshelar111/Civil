package scrolling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrollintoview {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\velocity\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(100));
		WebElement hiddenbox = driver.findElement(By.id("hide-textbox"));
		JavascriptExecutor j = ((JavascriptExecutor)driver);
		Thread.sleep(1000);
		j.executeScript("arguments[0].scrollIntoView(true);",hiddenbox);
		hiddenbox.click();
		

	}

}
