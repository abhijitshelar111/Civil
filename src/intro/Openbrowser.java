package intro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Openbrowser {

	public static void main(String[] args)
	{
		
	    System.setProperty("webdriver.chrome.driver", "E:\\velocity\\chromedriver\\chromedriver_win32\\chromedriver.exe");
	    
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://www.youtube.com/");
	    
	  //  driver.close();  close the current tab
	//	driver.quit();  close the all tabs
	    
	    driver.manage().window().maximize();
	 //   driver.manage().window().minimize();
	  //  driver.navigate().to("https://vctcpune.com/");
	   // driver.navigate().back();
	   // driver.navigate().forward();
	   // driver.navigate().refresh();
	   // String Title= driver.getTitle();
	   // System.out.println("title is "+Title);
	    System.out.println(driver.getTitle());
	    System.out.println(driver.getCurrentUrl());

	}

}
