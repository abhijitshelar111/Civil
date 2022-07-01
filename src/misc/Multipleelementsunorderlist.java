package misc;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multipleelementsunorderlist {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\velocity\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		driver.findElement(By.name("q")).sendKeys("royal enfield");
		List<WebElement> searchresult = driver.findElements(By.xpath("(//ul[@jsname='bw4e9b'])[1]//li"));
		for(WebElement search:searchresult)
		{
			System.out.println(search.getText());
		}
		String expectedresult="royal enfield himalayan";
		for(WebElement result:searchresult)
		{
			String actualresult=result.getText();
			if(actualresult.equals(expectedresult))
			{
				result.click();
				break;
			}
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	driver.findElement(By.linkText("Images")).click();
		driver.findElement(By.partialLinkText("Ima")).click();

	}

}
