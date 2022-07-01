package actiononmouse;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionclick {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\velocity\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/buttons");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		WebElement cl = driver.findElement(By.xpath("//button[text()='Click Me']"));
        Actions ac=new Actions(driver);
       // 1st way
        ac.moveToElement(cl).perform();
        ac.click().perform();
        //2nd way
        ac.moveToElement(cl).click().build().perform();
        //3rd way
        ac.click(cl).perform();
        //context click-- right click
       WebElement cc = driver.findElement(By.id("rightClickBtn"));
       ac.contextClick(cc).perform();
    //   ac.moveToElement(cc).contextClick().build().perform();
       
        
	}

}
