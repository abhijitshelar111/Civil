package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Isdisplayeduse {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\velocity\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(1000);
		WebElement textbox = driver.findElement(By.id("displayed-text"));
		boolean result = textbox.isDisplayed();
		System.out.println("text box result is "+result);
		textbox.sendKeys("hi good morning");
		Thread.sleep(1000);
		driver.findElement(By.id("hide-textbox")).click();
		boolean result1 = textbox.isDisplayed();
		System.out.println("text box is "+result1);
		

	}

}
