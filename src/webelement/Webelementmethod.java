package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelementmethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\velocity\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zomato.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[contains(@placeholder,'Search for')]")).sendKeys("ranjai");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@placeholder,'Search for')]")).clear();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		WebElement result2 = driver.findElement(By.id("checkBoxOption1"));
		result2.click();
		boolean checkbox = result2.isSelected();
		System.out.println(checkbox);
		
				
		
		

	}

}
