package zerodha;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Kite {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\velocity\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		WebElement userid = driver.findElement(By.xpath("//input[@type='text']"));
		WebElement password = driver.findElement(By.id("password"));
		WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
		userid.sendKeys("ELR321");
		password.sendKeys("Dhana1111");
		login.click();
		WebElement pin = driver.findElement(By.id("pin"));
		WebElement cont = driver.findElement(By.xpath("//button[@type='submit']"));
	    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		pin.sendKeys("982278");
		cont.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	     WebElement user= driver.findElement(By.xpath("//span[@class='user-id']"));
	     String actualuserid = user.getText();
	     String expecteduserid="ELR321";
	     if(actualuserid.equals(expecteduserid))
	     {
	    	 System.out.println("userid is matching testcase is passed");
	     }
	     else
	     {
	    	 System.out.println("userid is not matching testcase is failed");
	     }
	     
	     user.click();
	     driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	     WebElement logout = driver.findElement(By.xpath("//a[@target='_self']"));
	     logout.click();
	     driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	     driver.close();
	     
	     
		
		 
		

	}

}
