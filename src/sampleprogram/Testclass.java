package sampleprogram;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testclass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\velocity\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		Kiteloginpage login=new Kiteloginpage(driver);
	    login.sendusername();
		login.sendpassword();
		login.clickloginbutton();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		Kitepinpage pin=new Kitepinpage(driver);
		pin.sendpin();
		pin.clicksubmitbutton();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		Kitehomepage logout=new Kitehomepage(driver);
		logout.getuserid();
		logout.clicklogoutbutton();

	}

}
