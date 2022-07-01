package webtable;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tablereading {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\velocity\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	//	driver.manage().window().maximize();
		driver.get("https://www.cricbuzz.com/cricket-series/4061/indian-premier-league-2022/points-table");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
        List<WebElement> table = driver.findElements(By.xpath("//body/div[1]/div[2]/div[4]/div[1]/table"));
        System.out.println("================================================");
        for(int i=2;i<12;i++)
        {
        	for(int j=1;j<=table.size();j++)
        	{
        		String txt = driver.findElement(By.xpath("//body/div[1]/div[2]/div[4]/div[1]/table["+i+"]/table["+j+"]")).getText();
        		System.out.print(" |"+txt+" |");
        	}
        	System.out.println();
        }

	}

}
