package actiononmouse;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actionsdraganddrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\velocity\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/droppable/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		WebElement src = driver.findElement(By.xpath("//div[text()='Drag me']"));
		WebElement desti = driver.findElement(By.id("droppable"));
	    org.openqa.selenium.interactions.Actions a= new org.openqa.selenium.interactions.Actions(driver);
	    //1st way
	    a.dragAndDrop(src, desti).perform();
	    //2nd way
	   a.clickAndHold(src).moveToElement(desti).release().build().perform();
	}

}
