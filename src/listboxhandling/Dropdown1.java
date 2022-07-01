package listboxhandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\velocity\\chromedriver\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        Thread.sleep(100);
        driver.findElement(By.xpath("//a[contains(@id,'u_0_2_')]")).click();
        Thread.sleep(1000);
        WebElement day = driver.findElement(By.name("birthday_day"));
        Select s=new Select(day);
        for(int i=0;i<=9;i++)
        {
        	Thread.sleep(1000);
        	s.selectByIndex(i);
        }
        
        for(int i=9;i>=0;i--)
        {
        	Thread.sleep(1000);
        	s.selectByIndex(i);
        }
		
        boolean result = s.isMultiple();
        System.out.println("multiple selection available result is "+result);

	}

}
