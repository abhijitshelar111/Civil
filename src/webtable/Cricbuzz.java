package webtable;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cricbuzz {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\velocity\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/48009/csxi-vs-nz-2nd-warm-up-match-new-zealand-tour-of-england-2022");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
       List<WebElement> column = driver.findElements(By.xpath("//body/div[1]/div[2]/div[4]/div[2]/div[2]/div"));
       for(int i=1;i<=11;i++)
       {
    	   for(int j=1;j<=column.size();j++)
    	   {
   String txt=driver.findElement(By.xpath("//body/div[1]/div[2]/div[4]/div[2]/div[2]/div/div["+i+"]/div["+j+"]")).getText();
   System.out.print(" "+txt+" ");
   
    	   }
    	 System.out.println();  
       }
	}

}
