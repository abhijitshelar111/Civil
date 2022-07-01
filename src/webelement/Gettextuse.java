package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gettextuse {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\velocity\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		WebElement actualtext = driver.findElement(By.xpath("//h2[text()='Login to Kite']"));
		String a1=actualtext.getText();
		System.out.println(a1);
        String a2="Login to Kite";
        if(a1.equals(a2))
        {
        	System.out.println("text is matched, tc is passed");
        }
        else
        {
        	System.out.println("text is not matched, tc is failed");
        }
	}

}
