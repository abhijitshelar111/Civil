package listboxhandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdownuse {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\velocity\\chromedriver\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        Thread.sleep(100);
        driver.findElement(By.xpath("//a[contains(@id,'u_0_2_')]")).click();
        Thread.sleep(1000);
        WebElement year = driver.findElement(By.name("birthday_year"));
        Select s=new Select(year);
        s.selectByIndex(4);
        Thread.sleep(1000);
        s.selectByVisibleText("2003");
        Thread.sleep(1000);
        s.selectByValue("1993");
        Thread.sleep(1000);
        
        for(int i=0;i<=2000;i++)
        {
        	Thread.sleep(1000);
        	s.selectByIndex(i);
        }
        
	}

}
