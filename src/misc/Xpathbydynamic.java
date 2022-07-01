package misc;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathbydynamic {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\velocity\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("hp laptop");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		WebElement rating = driver.findElement(By.xpath("(//div[@class='gUuXy-'][1]//span)[4]"));
		System.out.println(rating.getText());
		rating.click();
		WebElement reviews = driver.findElement(By.xpath("(//div[@class='gUuXy-'][1]//span)[6]"));
		System.out.println(reviews.getText());
		
	}

}
